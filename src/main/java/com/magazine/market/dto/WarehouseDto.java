package com.magazine.market.dto;

import com.magazine.market.entity.Warehouse;
import lombok.Data;

@Data
public class WarehouseDto {
    private Long id;
    private String  title;
    private String  city;
    private String  street;
    private String  location;

    public static WarehouseDto of (Warehouse warehouse){
        WarehouseDto warehouseDto = new WarehouseDto ();
        warehouse.setTitle (warehouse.getTitle ());
        return warehouseDto;
    }
}
