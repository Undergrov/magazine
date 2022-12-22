package com.magazine.market.dto;

import lombok.Data;

import java.util.List;

@Data
public class TransInfoDto {
    private Long id;
    private String  name_carrier;//@ManyToOne
    private String car_model;//@ManyToOne
    private int  load_capacity;
}
