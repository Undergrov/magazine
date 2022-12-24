package com.magazine.market.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Transporter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String carModel;
    private int capacity;

    @OneToMany(mappedBy = "transporter")
    private List<Delivery> deliveries;
}
