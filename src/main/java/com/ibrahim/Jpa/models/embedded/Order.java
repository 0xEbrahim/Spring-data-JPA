package com.ibrahim.Jpa.models.embedded;


import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "orders")
public class Order {

    @EmbeddedId
    private OrderId orderId;

    private String f1;

    private String f2;

    @Embedded
    private Address address;
}
