package com.university_springboot.controller;

import com.university_springboot.entity.Group;
import com.university_springboot.service.interfaces.GroupService;
import com.university_springboot.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UniversityRESTController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private GroupService groupService;

    // ---------------student---------------

    // student - getAll & filter
/*    @GetMapping("/students")
    public ResponseEntity<List<Student>> getFilteredStudentsByLastName(
            @RequestParam(value = "lastName", required=false) String lastName
    ) {
        if (lastName != null) {
            return new ResponseEntity<>(
                    studentService.getFilteredStudentsByLastName(lastName), HttpStatus.OK);
        }
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    // student - getById
    @GetMapping("/students/{id}") // id is a 'Path variable'
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);
        if (student == null) {
            throw new NoSuchEntityException("There is no student with id = " + id + " in db");
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // student - add
    @PostMapping(value="/students")
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // student - update
    @PutMapping("/students")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // student - delete
    @DeleteMapping("/students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);
        if (student == null) {
            throw new NoSuchEntityException("There is no student with id = " + id +
                    " in db");
        }
        studentService.deleteStudent(id);
        return new ResponseEntity<>(
                "Student with id = " + id + " was successfully deleted", HttpStatus.OK);
    }*/

    // ---------------group---------------

    // group - getAll & filter
    @GetMapping("/groups")
    public ResponseEntity<List<Group>> getFilteredGroupsByName(
            @RequestParam(value = "name", required=false) String name
    ) {
/*        if (name != null) {
            return new ResponseEntity<>(groupService.getFilteredGroupsByName(name),
                    HttpStatus.OK);
        }*/
        return new ResponseEntity<>(groupService.getAllGroups(), HttpStatus.OK);
    }

    /*// group - getById
    @GetMapping("/groups/{id}")
    public ResponseEntity<Group> getGroup(@PathVariable int id) {
        Group group = groupService.getGroup(id);
        if (group == null) {
            throw new NoSuchEntityException("There is no group with id = " + id + " in db");
        }
        return new ResponseEntity<>(group, HttpStatus.OK);
    }

    // group - add
    @PostMapping("/groups")
    public ResponseEntity<Group> addNewGroup(@RequestBody Group group) {
        groupService.saveGroup(group);
        return new ResponseEntity<>(group, HttpStatus.OK);
    }

    // group - update
    @PutMapping("/groups")
    public ResponseEntity<Group> updateGroup(@RequestBody Group group) {
        groupService.saveGroup(group);
        return new ResponseEntity<>(group, HttpStatus.OK);
    }

    // group - delete
    @DeleteMapping("/groups/{id}")
    public ResponseEntity<String> deleteGroup(@PathVariable int id) {
        Group group = groupService.getGroup(id);
        if (group == null) {
            throw new NoSuchEntityException("There is no group with id = " + id +
                    " in db");
        }
        groupService.deleteGroup(id);
        return new ResponseEntity<>(
                "Group with id = " + id + " was successfully deleted", HttpStatus.OK);
    }*/
}
