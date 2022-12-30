package com.magazine.market.controller;

import com.magazine.market.dto.WarehouseDto;
import com.magazine.market.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController {
    private final WarehouseService warehouseService;

    @GetMapping
    private Page<WarehouseDto> getAll(@RequestParam(required = false) String title,
                                      @PageableDefault(sort = "id", direction = Sort.Direction.ASC) @ParameterObject Pageable pageable) {
        return warehouseService.getAll(title, pageable);
    }

    @GetMapping(value = "/{id}")
    public WarehouseDto get(@PathVariable Long id){
        return warehouseService.get ( id );
    }

    @PostMapping
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
