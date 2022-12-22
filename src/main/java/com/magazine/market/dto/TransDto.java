package com.magazine.market.dto;

import lombok.Data;

import java.util.List;

@Data
public class TransDto {
    private Long id;
    private List<DeliveryInfoDto>  name_carrier;//@ManyToOne
    private List<DeliveryInfoDto> car_model;//@ManyToOne
    private int  load_capacity;
}
