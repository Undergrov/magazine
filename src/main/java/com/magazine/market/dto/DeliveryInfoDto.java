package com.magazine.market.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DeliveryInfoDto {
    private Long id;
    private LocalDate delivery_date;
    private String cargo_name;
    private String  transporter;
    private int cargo_amount;
    private String warehouse_to;
    private String  warehouse_from;
}
