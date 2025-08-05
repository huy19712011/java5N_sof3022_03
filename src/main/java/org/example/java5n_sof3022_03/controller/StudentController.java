package org.example.java5n_sof3022_03.controller;

import lombok.RequiredArgsConstructor;
import org.example.java5n_sof3022_03.entity.Student;
import org.example.java5n_sof3022_03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {

    //@Autowired
    private final StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model model) {

        // get data from db
        List<Student> students = studentService.getAllStudents();

        // send data to view
        model.addAttribute("students", students);
        return "views/students";

    }
}
