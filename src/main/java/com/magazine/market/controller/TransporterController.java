package com.magazine.market.controller;

import com.magazine.market.dto.TransporterDto;
import com.magazine.market.service.TransporterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequiredArgsConstructor
@RestController

@RequestMapping("/api/transporter")
public class TransporterController {
    private final TransporterService transporterService;

    @GetMapping()
    public List<TransporterDto> getAll(){
        return transporterService.getAll ();
    }

    @GetMapping("/{id}")
    public TransporterDto get(@PathVariable Long id){
        return transporterService.get ( id );
    }

    @PostMapping()
    public void create(@RequestBody TransporterDto transporter){
        transporterService.create(transporter);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody TransporterDto transporter){
        transporterService.update(id, transporter);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        transporterService.delete(id);
    }
}
