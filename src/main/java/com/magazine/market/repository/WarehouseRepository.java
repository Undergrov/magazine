package com.magazine.market.repository;

import com.magazine.market.entity.Warehouse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    @Query("SELECT p FROM Warehouse p WHERE :title IS null OR lower(p.title) LIKE concat('%', lower(:title), '%')")
    Page<Warehouse> findAllBy(String title, Pageable pageable);
}
