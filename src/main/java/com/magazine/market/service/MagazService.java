package com.magazine.market.service;

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

    public List<Delivery> getAll(){
        return magazRepository.findAll ();
    }

    public Delivery get(Long id) {
        return magazRepository.findById(id).orElseThrow( EntityNotFoundException::new );
    }

    public void create(Delivery delivery) {
        magazRepository.save ( delivery  );
    }

    public void update(Long id, Delivery delivery) {
        Delivery existingDelivery = magazRepository.findById(id).orElseThrow( EntityNotFoundException::new );
        existingDelivery.setCargo_name ( delivery.getCargo_name ());
        magazRepository.save ( existingDelivery );
    }
    public void delete(Long id) {
        magazRepository.deleteById ( id );
    }
}
