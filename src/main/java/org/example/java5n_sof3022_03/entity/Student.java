package org.example.java5n_sof3022_03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @Size(min = 2, max = 20, message = "Name must be 2 - 20 characters")
    private String name;
    @Email(message = "Please enter a valid email address")
    @Pattern(regexp = "^(.+)@(fpt\\.edu\\.vn)$", message = "Invalid FPT Poly Email")
    private String email;
    @Pattern(regexp = "^(0)\\d{9}", message = "Invalid phone number")
    private String phone;
}
