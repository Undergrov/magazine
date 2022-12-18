package com.magazine.market.repository;

import com.magazine.market.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazRepository  extends JpaRepository<Delivery, Long> {
}
