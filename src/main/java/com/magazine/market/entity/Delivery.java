package com.magazine.market.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Delivery {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String  cargo_name;
    private String  transporter;//@ManyToOne
    private int cargo_amount;
    private String  warehouse_to;//@OneToMany
    private String  warehouse_from;//@OneToMany

}
