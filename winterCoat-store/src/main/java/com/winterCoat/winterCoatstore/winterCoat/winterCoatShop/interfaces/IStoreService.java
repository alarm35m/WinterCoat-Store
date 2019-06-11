package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces;

import java.util.List;

public interface IStoreService {

    List<IStore> getAllStores();

    List<IStore> getStore(String zip);
}
