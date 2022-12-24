package com.magazine.market.entity;

import com.magazine.market.dto.WarehouseDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Warehouse {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    @Embedded
    private Location location;


    @OneToMany(mappedBy = "warehouseFrom")
    private List<Delivery> deliveriesFrom;


    @OneToMany(mappedBy = "warehouseTo")
    private List<Delivery> deliveriesTo;

}
