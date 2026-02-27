package com.example.StudentManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.StudentManagement.student;
import com.example.StudentManagement.service.studentService;

@RestController
@RequestMapping("/students")
public class studentController {

    private final studentService service;

    public studentController(studentService service) {
        this.service = service;
    }

    // ✅ CREATE
    @PostMapping
    public student createStudent(@RequestBody student student) {
        return service.saveStudent(student);
    }

    // ✅ READ ALL
    @GetMapping
    public List<student> getAllStudents() {
        return service.getAllStudents();
    }

    // ✅ READ BY ID
    @GetMapping("/{id}")
    public student getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // ✅ UPDATE
    @PutMapping("/{id}")
    public student updateStudent(@PathVariable Long id,
                                 @RequestBody student student) {
        return service.updateStudent(id, student);
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }

    // =============================
    // 🔹 TASK 5.4 - Custom Queries
    // =============================

    @GetMapping("/department/{department}")
    public List<student> getByDepartment(@PathVariable String department) {
        return service.getStudentsByDepartment(department);
    }

    @GetMapping("/age/{age}")
    public List<student> getByAge(@PathVariable int age) {
        return service.getStudentsByAgeGreaterThan(age);
    }

    // =============================
    // 🔹 TASK 5.5 - Sorting
    // =============================

    @GetMapping("/sort")
    public List<student> sortStudents() {
        return service.getStudentsSortedByName();
    }

    // =============================
    // 🔹 TASK 5.5 - Pagination
    // =============================

    @GetMapping("/page")
    public Object paginateStudents(@RequestParam int page,
                                   @RequestParam int size) {
        return service.getStudentsWithPagination(page, size);
    }
}