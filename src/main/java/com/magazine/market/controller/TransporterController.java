package com.magazine.market.controller;

import com.magazine.market.dto.TransporterDto;
import com.magazine.market.service.TransporterService;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/transporter")
public class TransporterController {
    private final TransporterService transporterService;

    @GetMapping
    private Page<TransporterDto> getAll(@RequestParam(required = false) String name,
                                      @PageableDefault(sort = "id", direction = Sort.Direction.ASC) @ParameterObject Pageable pageable) {
        return transporterService.getAll(name, pageable);
    }

    @GetMapping(value = "/{id}")
    public TransporterDto get(@PathVariable Long id){
        return transporterService.get ( id );
    }

    @PostMapping
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
