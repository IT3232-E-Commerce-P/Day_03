

# Student Management System API

This project is a simple RESTful API for managing students using Spring Boot. The API allows you to perform CRUD (Create, Read, Update, Delete) operations on a list of students. Each student has a registration number, name, age, course, and GPA.

### Features
- **Create**: Add a new student to the system.
- **Read**: Retrieve all students or search for a student by their registration number.
- **Update**: Modify the details of an existing student.
- **Delete**: Remove a student from the system.
- **Sort by GPA**: Get a list of students sorted by their GPA.
- **Filter by Age**: Get a list of students within a specified age range.

---

### API Endpoints

1. **Create a New Student (POST)**
   - **URL**: `/app/Students`
   - **Method**: `POST`
   - **Request Body (JSON)**:
     ```json
     {
        "regNo": "2020ICT04",
        "name": "Sara Jeson",
        "age": 20,
        "course": "IT",
        "gpa": 3.03
     }
    ```- **Response**: `"Student added successfully!"`

3. **Get All Students (GET)**
   - **URL**: `/app/Students`
   - **Method**: `GET`
   - **Response**: A list of all students in JSON format.

4. **Get a Specific Student by ID (GET)**
   - **URL**: `/app/Students/{id}`
   - **Method**: `GET`
   - **Parameters**:
     - `id`: Registration Number of the student (e.g., `2020ICT01`)
   - **Response**: A JSON object representing the student with the given ID.

5. **Update a Student (PUT)**
   - **URL**: `/app/Students/{id}`
   - **Method**: `PUT`
   - **Parameters**:
     - `id`: Registration Number of the student (e.g., `2020ICT01`)
   - **Request Body (JSON)**:
     ```json
     {
       "name": "Bob Marely",
       "age": 23,
       "course": "Computer Science",
       "gpa": 3.3
     }
     ```
   - **Response**: `"Student updated successfully!"`

6. **Delete a Student (DELETE)**
   - **URL**: `/app/Students/{id}`
   - **Method**: `DELETE`
   - **Parameters**:
     - `id`: Registration Number of the student (e.g., `2020ICT01`)
   - **Response**: `"Student deleted successfully!"`

7. **Filter Students by Age (GET)**
   - **URL**: `/app/Students/age/{min}/{max}`
   - **Method**: `GET`
   - **Parameters**:
     - `min`: Minimum age
     - `max`: Maximum age
   - **Response**: A list of students whose age is between the specified range.

8. **Sort Students by GPA (GET)**
   - **URL**: `/app/Students/sorted`
   - **Method**: `GET`
   - **Response**: A list of students sorted by their GPA in descending order.

## Screens
![Screenshot (13)](https://github.com/user-attachments/assets/4656dea9-15bc-41b6-937f-c895bd47d41f)
![Screenshot (14)](https://github.com/user-attachments/assets/06a1525b-0ead-4f7b-a653-0551a42857d0)

Get All Students (GET)
![Screenshot (15)](https://github.com/user-attachments/assets/77e55c33-3247-4636-97f0-2938647a15ec)

Get a Specific Student by ID (GET)
![Screenshot (16)](https://github.com/user-attachments/assets/df9b0633-7f84-4fbf-afc6-be7f5452ca5f)

Filter Students by Age (GET)
![Screenshot (17)](https://github.com/user-attachments/assets/728704a2-3e89-4f3b-9dbe-85e180d56e49)

Sort Students by GPA (GET)
![Screenshot (18)](https://github.com/user-attachments/assets/f8d75730-6bc2-4504-a769-23c78fc181d0)

Create a New Student (POST)
![Screenshot (19)](https://github.com/user-attachments/assets/75270b5a-61aa-4914-a224-c9da56ccf2b8)

Update a Student (PUT)
![Screenshot (21)](https://github.com/user-attachments/assets/90533930-1a94-435a-b6c8-83f4041b91ed)

Delete a Student (DELETE)
![Screenshot (22)](https://github.com/user-attachments/assets/9c9031ec-93e3-401f-a8c3-6f0d9c287694)

