package com.magazine.market.controller;


import com.magazine.market.entity.Delivery;
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
    public List<Delivery> getAll(){
        return magazService.getAll ();
    }

    @GetMapping("/{id}")
    public Delivery get(@PathVariable Long id){
        return magazService.get ( id );
    }

    @PostMapping()
    public void create(@RequestBody Delivery delivery){
        magazService.create(delivery);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Delivery delivery){
        magazService.update(id, delivery);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        magazService.delete(id);
    }
}
