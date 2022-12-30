package com.magazine.market.repository;

import com.magazine.market.entity.Delivery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
    @Query("SELECT p FROM Delivery p WHERE :cargoName IS null OR lower(p.cargoName) LIKE concat('%', lower(:cargoName), '%')")
    Page<Delivery> findAllBy(String cargoName, Pageable pageable);
}
