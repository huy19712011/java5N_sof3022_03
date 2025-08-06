package org.example.java5n_sof3022_03.repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.java5n_sof3022_03.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class StudentRepository {

    private final EntityManager em;

    public List<Student> getAllStudents() {

        return em.createQuery("FROM Student", Student.class).getResultList();
    }

    public void saveStudent(Student student) {

        em.persist(student);
    }
}
