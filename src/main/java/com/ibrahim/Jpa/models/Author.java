package com.ibrahim.Jpa.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "authors")
public class Author {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private Integer age;


    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;


    @Column(
            insertable = false,
            nullable = true
    )
    private LocalDateTime  updatedAt;

    @ManyToMany(mappedBy = "authors")
    private List<Course> course;
}
