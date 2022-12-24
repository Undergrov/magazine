package com.magazine.market.controller;

import com.magazine.market.dto.WarehouseDto;
import com.magazine.market.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController

@RequestMapping("/api/warehouse")
public class WarehouseController {
    private final WarehouseService warehouseService;

    @GetMapping()
    public List<WarehouseDto> getAll(){
        return warehouseService.getAll ();
    }

    @GetMapping("/{id}")
    public WarehouseDto get(@PathVariable Long id){
        return warehouseService.get ( id );
    }

    @PostMapping()
    public void create(@RequestBody WarehouseDto warehouse){
        warehouseService.create(warehouse);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody WarehouseDto warehouse){
        warehouseService.update(id, warehouse);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        warehouseService.delete(id);
    }
}
