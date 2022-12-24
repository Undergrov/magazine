package com.magazine.market.entity;

import com.magazine.market.dto.WarehouseDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Warehouse {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String  title;//@ManyToOne
    private String  city;
    private String  street;
    private String  location;

    public static Warehouse of (WarehouseDto warehouseDto){
        Warehouse warehouse = new Warehouse ();
        warehouse.setTitle (warehouseDto.getTitle ());
        return warehouse;
    }

}
