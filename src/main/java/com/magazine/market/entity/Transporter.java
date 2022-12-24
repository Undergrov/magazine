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
    private String  nameCarrier;//@OneToMany

    private String  carModel;//@OneToMany
    private int  loadCapacity;//OneToMany

    public static Transporter of (TransporterDto transporterDto){
        Transporter transporter = new Transporter ();
        transporter.setNameCarrier (transporterDto.getNameCarrier ());
        return transporter;
    }
}
