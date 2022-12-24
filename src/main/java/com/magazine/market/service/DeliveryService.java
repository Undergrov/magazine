package com.magazine.market.service;

import com.magazine.market.dto.DeliveryDto;
import com.magazine.market.entity.Delivery;
import com.magazine.market.exception.EntityNotFoundException;
import com.magazine.market.mapper.Mapper;
import com.magazine.market.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeliveryService {
    private final DeliveryRepository deliveryRepository;
    private final Mapper mapper;

    public List<DeliveryDto> getAll(){
        return deliveryRepository.findAll ().stream ().map (mapper::toDeliveryDto).toList ();
    }

    public DeliveryDto get(Long id) {
        return deliveryRepository.findById(id).map (mapper::toDeliveryDto).orElseThrow( EntityNotFoundException::new );
    }

    public void create(DeliveryDto deliveryDto) {
        deliveryRepository.save (mapper.toDelivery (deliveryDto));
    }

    public void update(Long id, DeliveryDto deliveryDto) {
        Delivery delivery = deliveryRepository.findById(id).orElseThrow( EntityNotFoundException::new );
        mapper.mergeDelivery (deliveryDto, delivery);
        deliveryRepository.save ( delivery );
    }
    public void delete(Long id) {
        deliveryRepository.deleteById ( id );
    }
}
