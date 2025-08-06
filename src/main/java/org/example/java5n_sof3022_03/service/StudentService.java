package org.example.java5n_sof3022_03.service;

import lombok.RequiredArgsConstructor;
import org.example.java5n_sof3022_03.entity.Student;
import org.example.java5n_sof3022_03.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {

        return studentRepository.getAllStudents();
    }

    public void saveStudent(Student student) {

        studentRepository.saveStudent(student);
    }
}
