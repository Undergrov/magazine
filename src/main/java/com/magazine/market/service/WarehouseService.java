package com.magazine.market.service;

import com.magazine.market.dto.WarehouseDto;
import com.magazine.market.entity.Warehouse;
import com.magazine.market.exception.EntityNotFoundException;
import com.magazine.market.mapper.Mapper;
import com.magazine.market.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class WarehouseService {
    private final WarehouseRepository warehouseRepository;
    private final Mapper mapper;

    public List<WarehouseDto> getAll(){
        return warehouseRepository.findAll ().stream ().map (mapper::toWarehouseDto).toList ();
    }

    public WarehouseDto get(Long id) {
        return warehouseRepository.findById(id).map (mapper::toWarehouseDto).orElseThrow( EntityNotFoundException::new );
    }

    public void create(WarehouseDto warehouseDto) {
        warehouseRepository.save (mapper.toWarehouse (warehouseDto));
    }

    public void update(Long id, WarehouseDto warehouseDto) {
        Warehouse warehouse = warehouseRepository.findById(id).orElseThrow( EntityNotFoundException::new );
        mapper.mergeWarehouse (warehouseDto, warehouse);
        warehouseRepository.save ( warehouse );
    }
    public void delete(Long id) {
        warehouseRepository.deleteById ( id );
    }
}
