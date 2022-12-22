package com.magazine.market.controller;


import com.magazine.market.dto.DeliveryDto;
import com.magazine.market.service.MagazService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController

@RequestMapping("/api/delivery")
public class MagazController {
    private final MagazService magazService;

    @GetMapping()
    public List<DeliveryDto> getAll(){
        return magazService.getAll ();
    }

    @GetMapping("/{id}")
    public DeliveryDto get(@PathVariable Long id){
        return magazService.get ( id );
    }

    @PostMapping()
    public void create(@RequestBody DeliveryDto delivery){
        magazService.create(delivery);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody DeliveryDto delivery){
        magazService.update(id, delivery);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        magazService.delete(id);
    }
}
