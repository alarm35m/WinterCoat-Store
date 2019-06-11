package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services;


import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.WinterCoat;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.repositories.WinterCoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// PostgresSQL Winter Coat Service

@Service
public class WinterCoatService {

    @Autowired
    WinterCoatRepository repository;

    @Autowired
    public void setWinterCoatRepository(WinterCoatRepository sp){
        this.repository = sp;
    }

    // create a new entry in sneaker table for testing purposes
    public void createWinterCoat() {
        System.out.println(repository.count());
        WinterCoat winterCoat = new WinterCoat();
        //winterCoat.setId(new Long(209446));
        winterCoat.setName("Cirruslite Down");
        winterCoat.setBrand("Eddie Bauer");
        winterCoat.setColor("Navy Blue");
        winterCoat.setSize("L");
        winterCoat.setType("Nylon");
        winterCoat.setPrice("100");
        winterCoat.setGender("male");

        repository.save(winterCoat);

        System.out.println(repository.count());
    }

    public WinterCoat saveWinterCoat(WinterCoat winterCoat){
        WinterCoat s = new WinterCoat();

        s.setId(winterCoat.getId());
        s.setBrand(winterCoat.getBrand());
        s.setName(winterCoat.getName());
        s.setColor(winterCoat.getColor());
        s.setPrice(winterCoat.getPrice());
        s.setSize(winterCoat.getSize());
        s.setType(winterCoat.getType());
        s.setGender(winterCoat.getGender());

        return s;

    }

    public WinterCoat getWinterCoat(Long winterCoatId){


        //will get the winter coat by a winterCoatId
        WinterCoat winterCoat = saveWinterCoat(repository.getOne(winterCoatId));

        return winterCoat;
    }

    // querys all the winter coats inside the winter coat table
    public List<WinterCoat> getAllWinterCoats(){
        System.out.println(repository.count());
        return repository.findAll();
    }

}
