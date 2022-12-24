package com.magazine.market.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class DeliveryDto {
    private Long id;
    private LocalDate deliveryDate;
    private String cargoName;
    private String  transporter;
    private int cargoAmount;
    private String warehouseTo;
    private String  warehouseFrom;
}
