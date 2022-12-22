package com.magazine.market.entity;

import com.magazine.market.dto.DeliveryDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private LocalDate delivery_date;
    private String  cargo_name;
    private String  transporter;//@OneToMany
    private int cargo_amount;
    private String  warehouse_to;//@OneToMany
    private String  warehouse_from;//@OneToMany

    public static Delivery of (DeliveryDto deliveryDto){
        Delivery delivery = new Delivery ();
        delivery.setCargo_name (deliveryDto.getCargo_name ().toString ());
        delivery.setDelivery_date (deliveryDto.getDelivery_date ());
        return delivery;
    }

}
