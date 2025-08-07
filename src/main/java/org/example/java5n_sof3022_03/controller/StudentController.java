package org.example.java5n_sof3022_03.controller;

import lombok.RequiredArgsConstructor;
import org.example.java5n_sof3022_03.entity.Student;
import org.example.java5n_sof3022_03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/students/showNewStudentForm")
    public String showNewStudentForm(Model model) {

        Student student = new Student();
        model.addAttribute("student", student);

        return "views/new_student";
    }

    @PostMapping("/students/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {

        // save student to DB
        studentService.saveStudent(student);

        // return to view
        return "redirect:/students";
    }

    @GetMapping("/students/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") long id) {

        studentService.deleteStudentById(id);

        return "redirect:/students";
    }

    @GetMapping("/students/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable("id") long id, Model model) {

        // get student
        Student student = studentService.getStudentById(id);

        // send data to view
        model.addAttribute("student", student);
        return "views/update_student";
    }

    @PostMapping("/students/updateStudent")
    public String updateStudent(@ModelAttribute("student") Student student) {

        // update to DB
        studentService.updateStudent(student);

        // return view
        return "redirect:/students";

    }
}
