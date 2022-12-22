package com.magazine.market.dto;

import lombok.Data;

import java.util.List;

@Data
public class WareDto {
    private Long id;
    private List<DeliveryInfoDto> title;
    private String  city;
    private String  street;
    private String  location;
}
