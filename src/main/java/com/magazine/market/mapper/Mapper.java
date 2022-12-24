package com.magazine.market.mapper;


import com.magazine.market.dto.DeliveryDto;
import com.magazine.market.dto.TransporterDto;
import com.magazine.market.dto.WarehouseDto;
import com.magazine.market.entity.Delivery;
import com.magazine.market.entity.Transporter;
import com.magazine.market.entity.Warehouse;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    DeliveryDto toDeliveryDto(Delivery delivery);
    Delivery toDelivery(DeliveryDto deliveryDto);
    void mergeDelivery(DeliveryDto deliveryDto, @MappingTarget Delivery delivery);

    TransporterDto toTransporterDto(Transporter transporter);
    Transporter toTransporter(TransporterDto transporterDto);
    void mergeTransporter(TransporterDto transporterDto, @MappingTarget Transporter transporter);

    WarehouseDto toWarehouseDto(Warehouse warehouse);
    Warehouse toWarehouse(WarehouseDto warehouseDto);
    void mergeWarehouse(WarehouseDto warehouseDto, @MappingTarget Warehouse warehouse);
}
