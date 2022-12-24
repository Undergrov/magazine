package com.magazine.market.entity;

import com.magazine.market.dto.TransporterDto;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Transporter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String  nameCarrier;//@ManyToOne

    private String  carModel;//@ManyToOne
    private int  loadCapacity;

    public static Transporter of (TransporterDto transporterDto){
        Transporter transporter = new Transporter ();
        transporter.setNameCarrier (transporterDto.getNameCarrier ());
        return transporter;
    }
}
