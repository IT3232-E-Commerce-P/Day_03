package lk.ac.vau.fas.ict.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class AppController {

    private List<Student> students = new ArrayList<>();

    public AppController() {
        students.add(new Student("2020ICT01", "Bob Marely", 23, "IT", 3.3));
        students.add(new Student("2020ICT02", "James Bond", 24, "IT", 3.1));
        students.add(new Student("2020ICT03", "Donald Trump", 25, "IT", 3.2));
    }

    @GetMapping("/home")
    public String homeMessage() {
        return "Welcome to Student Management System";
    }

    @GetMapping("/Student")
    public Student getStudent() {
        return students.get(0);
    }

    @GetMapping("/Students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/Students/{id}")
    public Student getStudent(@PathVariable("id") String regNo) {
        for (Student student : students) {
            if (student.getRegNo().equals(regNo)) {
                return student;
            }
        }
        return null;
    }

    @GetMapping("/Students/age/{min}/{max}")
    public List<Student> getStudentsByAgeRange(@PathVariable int min, @PathVariable int max) {
        List<Student> filteredStudents = new ArrayList<>();
        
        for (Student student : students) {
            if (student.getAge() >= min && student.getAge() <= max) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
    
    @GetMapping("/Students/sorted")
    public List<Student> getStudentsSortedByGPA() {
    List<Student> sortedStudents = new ArrayList<>(students);
     for(int i=0;i<sortedStudents.size();i++) {
    	 for(int j=i+1;j<sortedStudents.size();j++) {
    		 if(sortedStudents.get(i).getGpa()<sortedStudents.get(j).getGpa()) {
    			 Student temp = sortedStudents.get(i);
    			 sortedStudents.set(i, sortedStudents.get(j));
    			 sortedStudents.set(j, temp);
    		 }
    	 }
     }
     return sortedStudents;
}
    @PostMapping("/Students")
    public String addStudent(@RequestBody Student student){
    	students.add(student);
    	return "Student added successfully!";
    }
    
    @PutMapping("/Students/{id}")
    public String updateStudent(@PathVariable("id")String regNo,@RequestBody Student updatedStudent) {
    	for(Student student : students) {
    		if(student.getRegNo().equals(regNo)) {
    			student.setName(updatedStudent.getName());
    			student.setAge(updatedStudent.getAge());
    			student.setCourse(updatedStudent.getCourse());
    			student.setGpa(updatedStudent.getGpa());
    			return "student updated successfully!";
    			
    		}
    	}
    	return "Student not found!";
    }
}
