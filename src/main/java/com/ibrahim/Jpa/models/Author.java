package com.ibrahim.Jpa.models;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity(name = "authors")
public class Author extends BaseEntity{


    @Column(length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private Integer age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
