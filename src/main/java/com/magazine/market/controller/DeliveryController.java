package com.magazine.market.controller;

import com.magazine.market.dto.DeliveryDto;
import com.magazine.market.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    @GetMapping
    public List<DeliveryDto> getAll() {
        return deliveryService.getAll ();
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
