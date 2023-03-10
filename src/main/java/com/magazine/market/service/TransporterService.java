package com.magazine.market.service;


import com.magazine.market.dto.TransporterDto;
import com.magazine.market.entity.Transporter;
import com.magazine.market.exception.EntityNotFoundException;
import com.magazine.market.mapper.Mapper;
import com.magazine.market.repository.TransporterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TransporterService {
    private final TransporterRepository transporterRepository;
    private final Mapper mapper;

    public Page<TransporterDto> getAll(String name, Pageable pageable) {
        return transporterRepository.findAllBy(name, pageable).map(mapper::toTransporterDto);
    }

    public TransporterDto get(Long id) {
        return transporterRepository.findById(id).map (mapper::toTransporterDto).orElseThrow( EntityNotFoundException::new );
    }

    public void create(TransporterDto transporterDto) {
        transporterRepository.save (mapper.toTransporter (transporterDto));
    }

    public void update(Long id, TransporterDto transporterDto) {
        Transporter transporter = transporterRepository.findById(id).orElseThrow( EntityNotFoundException::new );
        mapper.mergeTransporter (transporterDto, transporter);
        transporterRepository.save ( transporter );
    }
    public void delete(Long id) {
        transporterRepository.deleteById ( id );
    }
}
