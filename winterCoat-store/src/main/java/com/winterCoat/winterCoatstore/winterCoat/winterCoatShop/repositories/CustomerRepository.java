package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.repositories;

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
