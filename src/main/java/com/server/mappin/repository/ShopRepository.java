package com.server.mappin.repository;

import com.server.mappin.domain.Lost;
import com.server.mappin.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
}