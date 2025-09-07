package com.ibrahim.Jpa.models;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "resources")
public class Resource extends BaseEntity {


    private String name;

    private int size;

    @OneToOne
    @JoinColumn(name="lecture_id")
    private Lecture lecture;
}
