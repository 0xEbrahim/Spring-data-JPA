package com.ibrahim.Jpa.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "courses")
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;
}
