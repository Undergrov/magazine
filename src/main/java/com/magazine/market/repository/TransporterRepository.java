package com.magazine.market.repository;

import com.magazine.market.entity.Transporter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporterRepository extends JpaRepository<Transporter, Long> {
    @Query("SELECT p FROM Transporter p WHERE :name IS null OR lower(p.person) LIKE concat('%', lower(:name), '%')")
    Page<Transporter> findAllBy(String name, Pageable pageable);
}
