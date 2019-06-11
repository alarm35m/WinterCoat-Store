package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.repositories;

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
