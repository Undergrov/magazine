package com.magazine.market.entity;

import com.magazine.market.dto.DeliveryDto;
import com.magazine.market.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Delivery {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private LocalDate deliveryDate;
    private String  cargoName;
    private String  transporter;//@OneToMany
    private int cargoAmount;
    private String  warehouseTo;//@OneToMany
    private String  warehouseFrom;//@OneToMany
    @Enumerated
    private Status status;

    public static Delivery of (DeliveryDto deliveryDto){
        Delivery delivery = new Delivery ();
        delivery.setCargoName (deliveryDto.getCargoName ());
        delivery.setDeliveryDate (deliveryDto.getDeliveryDate ());
        return delivery;
    }

}
