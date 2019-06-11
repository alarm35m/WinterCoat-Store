package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.repositories;

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.WinterCoat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WinterCoatRepository extends JpaRepository<WinterCoat, Long> {
}
