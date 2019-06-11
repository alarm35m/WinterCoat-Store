package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services;

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.Customer;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces.ICustomer;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.repositories.CustomerRepository;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.repositories.WinterCoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    @Autowired
    public void setCustomerRepository(CustomerRepository cp) { this.repository = cp; }

    // this is for testing purposes
    public void saveCustomerRaffleInfo(){
        System.out.println(repository.count());
        Customer customer = new Customer();
        customer.setWinterCoatId((long) 9);
        customer.setName("Michael");
        customer.setEmail("michael@gyahoo.com");
        customer.setPhoneNumber("773-555-1234");

        repository.save(customer);

        System.out.println(repository.count());
    }

    public void saveCustomerRaffleInfo(Customer customer){

        repository.save(customer);

    }

    public Customer getCustomer(Long raffleId){

        //gets customer by raffle id
        Customer customer = repository.getOne(raffleId);

        return customer;

    }

    public List<Customer> getAllCustomers(){
        System.out.println(repository.count());
        return repository.findAll();
    }




}
