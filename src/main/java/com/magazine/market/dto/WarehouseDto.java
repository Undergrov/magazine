package com.magazine.market.dto;

import com.magazine.market.entity.Location;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
public class WarehouseDto {
    private Long id;
    private String  title;

}
