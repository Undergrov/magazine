package com.magazine.market.dto;

import com.magazine.market.entity.Delivery;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class DeliveryDto {
    private Long id;
    private LocalDate delivery_date;
    private List<TransInfoDto>  cargo_name;
    private List<TransInfoDto>  transporter;
    private int cargo_amount;
    private List<WareInfoDto> warehouse_to;
    private List<WareInfoDto>  warehouse_from;

    public static DeliveryDto of (Delivery delivery){
       DeliveryDto deliveryDto = new DeliveryDto ();
       delivery.setCargo_name (delivery.getCargo_name ());
       delivery.setDelivery_date (delivery.getDelivery_date ());
       return deliveryDto;
    }
}
