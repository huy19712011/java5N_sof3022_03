package org.example.java5n_sof3022_03.service;

import lombok.RequiredArgsConstructor;
import org.example.java5n_sof3022_03.entity.Student;
import org.example.java5n_sof3022_03.repository.StudentRepository;
import org.example.java5n_sof3022_03.repository.StudentRepositoryV2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentRepositoryV2 studentRepositoryV2;

    public List<Student> getAllStudents() {

        return studentRepository.getAllStudents();
    }

    public void saveStudent(Student student) {

        studentRepository.saveStudent(student);
    }

    public void deleteStudentById(long id) {

        studentRepository.deleteStudentById(id);
    }

    public Student getStudentById(long id) {

        return studentRepository.getStudentById(id);
    }

    public void updateStudent(Student student) {

        studentRepository.updateStudent(student);
    }

    public Page<Student> findPaginated(int pageNo, int pageSize, String sortField, String sortDir) {

        return studentRepositoryV2.findAll(PageRequest.of(pageNo - 1, pageSize, Sort.by(Sort.Direction.fromString(sortDir), sortField)));
    }
}
