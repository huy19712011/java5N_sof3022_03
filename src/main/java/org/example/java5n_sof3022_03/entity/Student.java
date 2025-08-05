package org.example.java5n_sof3022_03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Student {

    @Id
    private Long id;
    private String name;
    private String email;
    private String phone;
}
