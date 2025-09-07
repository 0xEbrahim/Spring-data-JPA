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
@Entity(name = "resources")
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;


}
