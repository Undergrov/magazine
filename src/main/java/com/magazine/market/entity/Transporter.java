package com.magazine.market.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Transporter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String  name_carrier;//@ManyToOne

    private String  car_model;//@ManyToOne
    private int  load_capacity;

}
