package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities;

// SQL Entity

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces.IShoppingCart;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ShoppingCart implements Serializable, IShoppingCart {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long winterCoatId;

    @Column
    private Integer quantity;

    public ShoppingCart(){

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getWinterCoatId() {
        return winterCoatId;
    }

    @Override
    public void setWinterCoatId(Long winterCoatId) {
        this.winterCoatId = winterCoatId;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
