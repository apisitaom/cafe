package com.example.backend.Repository;

import com.example.backend.Entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository< ShopEntity, Long > {

}