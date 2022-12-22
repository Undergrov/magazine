package com.magazine.market.service;

import com.magazine.market.dto.DeliveryDto;
import com.magazine.market.entity.Delivery;
import com.magazine.market.exception.EntityNotFoundException;
import com.magazine.market.repository.MagazRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MagazService {
    private final MagazRepository magazRepository;

    public List<DeliveryDto> getAll(){
        return magazRepository.findAll ().stream ().map (DeliveryDto::of).toList ();
    }

    public DeliveryDto get(Long id) {
        return magazRepository.findById(id).map (DeliveryDto::of).orElseThrow( EntityNotFoundException::new );
    }

    public void create(DeliveryDto deliveryDto) {
        magazRepository.save (Delivery.of(deliveryDto));
    }

    public void update(Long id, DeliveryDto deliveryDto) {
        Delivery delivery = magazRepository.findById(id).orElseThrow( EntityNotFoundException::new );
        delivery.setCargo_name (deliveryDto.getCargo_name ().toString ());
        magazRepository.save ( delivery );
    }
    public void delete(Long id) {
        magazRepository.deleteById ( id );
    }
}
