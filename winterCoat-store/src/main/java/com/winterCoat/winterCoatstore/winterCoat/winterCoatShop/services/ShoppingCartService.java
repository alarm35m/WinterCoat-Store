package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services;

// PostgresSQL ShoppingCart Service

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.ShoppingCart;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.WinterCoat;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository repository;

    @Autowired
    public void setShoppingCartRepository(ShoppingCartRepository scp) { this.repository = scp; }

    // create a new entry in the shopping cart table
    public void saveWinterCoatInShoppingCart(){
        System.out.println(repository.count());
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setWinterCoatId(new Long(10));
        shoppingCart.setQuantity(3);

        repository.save(shoppingCart);

        System.out.println(repository.count());

    }

    public void saveWinterCoatInShoppingCart(ShoppingCart shoppingCart){
        repository.save(shoppingCart);
    }


    public List<ShoppingCart> getAllItems(){
        System.out.println(repository.count());
        return repository.findAll();
    }

}
