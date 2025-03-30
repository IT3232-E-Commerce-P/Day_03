package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;
@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("/home")
	public String homeMessage() {
		return "Welcome to Student Management System";
	}
	
	Student Bob = new Student("2020ICT01","Bob Marely",25,"IT",3.3);
	Student James = new Student("2020ICT02","James Bond",24,"IT",3.1);
	Student Donald = new Student("2020ICT03","Donald Trump",25,"IT",3.2);
	
    @GetMapping("/Student")
    public Student getStudent() {
    	return Bob;
    }
	
}

