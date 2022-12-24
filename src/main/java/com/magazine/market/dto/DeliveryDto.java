package com.magazine.market.dto;

import com.magazine.market.entity.Delivery;
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

    public static DeliveryDto of (Delivery delivery){
       DeliveryDto deliveryDto = new DeliveryDto ();
       deliveryDto.setCargoName (delivery.getCargoName ());
       deliveryDto.setDeliveryDate (delivery.getDeliveryDate ());
       return deliveryDto;
    }
}
