package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces;

public interface IShoppingCart {

    boolean equals(Object object);

    Long getId();

    Long getWinterCoatId();

    Integer getQuantity();

    void setId(Long id);

    void setWinterCoatId(Long winterCoatId);

    void setQuantity(Integer quantity);

    String toString();

}
