package com.magazine.market.service;

import com.magazine.market.dto.WarehouseDto;
import com.magazine.market.entity.Warehouse;
import com.magazine.market.exception.EntityNotFoundException;
import com.magazine.market.mapper.Mapper;
import com.magazine.market.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WarehouseService {
    private final WarehouseRepository warehouseRepository;
    private final Mapper mapper;

    public Page<WarehouseDto> getAll(String name, Pageable pageable) {
        return warehouseRepository.findAllBy(name, pageable).map(mapper::toWarehouseDto);
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
