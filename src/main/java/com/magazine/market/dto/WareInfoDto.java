package com.magazine.market.dto;

import lombok.Data;

import java.util.List;

@Data
public class WareInfoDto {
    private Long id;
    private String title;
    private String  city;
    private String  street;
    private String  location;
}
