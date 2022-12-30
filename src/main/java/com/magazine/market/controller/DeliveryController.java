package com.magazine.market.controller;

import com.magazine.market.dto.DeliveryDto;
import com.magazine.market.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    @GetMapping
    private Page<DeliveryDto> getAll(@RequestParam(required = false) String cargoName,
                                      @PageableDefault(sort = "id", direction = Sort.Direction.ASC) @ParameterObject Pageable pageable) {
        return deliveryService.getAll(cargoName, pageable);
    }

    @GetMapping(value = "/{id}")
    public DeliveryDto get(@PathVariable Long id) {
        return deliveryService.get (id);
    }

    @PostMapping
    public void create(@RequestBody DeliveryDto delivery) {
        deliveryService.create (delivery);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody DeliveryDto delivery) {
        deliveryService.update (id, delivery);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deliveryService.delete (id);
    }
}
