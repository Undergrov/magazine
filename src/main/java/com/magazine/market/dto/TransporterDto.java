package com.magazine.market.dto;

import com.magazine.market.entity.Transporter;
import lombok.Data;

@Data
public class TransporterDto {
    private Long id;
    private String  nameCarrier;//@ManyToOne
    private String carModel;//@ManyToOne
    private int  loadCapacity;

    public static TransporterDto of (Transporter transporter){
        TransporterDto transporterDto = new TransporterDto ();
        transporterDto.setNameCarrier (transporter.getNameCarrier ());
        return transporterDto;
    }
}
