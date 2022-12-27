package com.magazine.market.dto;

import com.magazine.market.entity.enums.DeliveryStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import java.time.LocalDate;

@Data
public class DeliveryDto {
    private Long id;
    private LocalDate deliveryDate;
    private String cargoName;
    private int cargoAmount;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
    private TransporterDto transporter;
    private WarehouseDto warehouseTo;
    private WarehouseDto  warehouseFrom;
}
