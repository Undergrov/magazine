package com.magazine.market.dto;

import lombok.Data;

@Data
public class TransporterDto {
    private Long id;
    private String person;
    private String carModel;
    private int capacity;
}
