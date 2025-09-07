package com.ibrahim.Jpa.models;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "lectures")
public class Lecture extends BaseEntity{


    private String name;

    @ManyToOne()
    @JoinColumn(name="section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name="resource_id")
    private Resource resource;
}
