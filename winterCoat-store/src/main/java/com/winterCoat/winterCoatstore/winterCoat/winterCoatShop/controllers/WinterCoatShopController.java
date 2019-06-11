package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.controllers;

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.Customer;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.ShoppingCart;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.WinterCoat;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.Store;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces.IStore;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.CustomerService;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.ShoppingCartService;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.WinterCoatService;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WinterCoatShopController {
    StoreService storeService = new StoreService();

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private WinterCoatService winterCoatService;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "index";
    }

    @GetMapping("/store")
    public String storePage(Model model){
        model.addAttribute("shoppingCart", new ShoppingCart());
        return "store";
    }

    @PostMapping("/store")
    public String winterCoatSubmit(ShoppingCart shoppingCart, Model model){

        model.addAttribute("shoppingCart", shoppingCart);

        shoppingCartService.saveWinterCoatInShoppingCart(shoppingCart);

        return "store";
    }

    @GetMapping("/shoppingCart")
    public String shoppingCartPage(Model model){

        List<ShoppingCart> shoppingCartList = shoppingCartService.getAllItems();
        model.addAttribute("shoppingCartList", shoppingCartList);

        List<WinterCoat> winterCoatList = winterCoatService.getAllWinterCoats();
        model.addAttribute("winterCoatList", winterCoatList);
        
        return "shoppingCart";
    }

    @GetMapping("/raffle")
    public String raffleForm(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("winterCoat", new WinterCoat());
        return "raffle";
    }


    @PostMapping("/raffle")
    public String raffleSubmit(Customer customer, Model model){
        model.addAttribute("customer", customer);

        customerService.saveCustomerRaffleInfo(customer);

        Customer c = customerService.getCustomer(customer.getRaffleId());
        model.addAttribute("customer", c);

        WinterCoat winterCoat = winterCoatService.getWinterCoat(c.getWinterCoatId());

        model.addAttribute("winterCoat", winterCoat);

        return "raffle";
    }

    @GetMapping("/storelookup")
    public String storeLookUpForm(Model model){
        model.addAttribute("store", new Store());
        return "storelookup";
    }


    @PostMapping("/storelookup")
    public String storeLookUpSubmit(IStore store, Model model){
        List<IStore> stores = storeService.getStore(store.getZip());

        for(IStore s: stores){
            model.addAttribute("store", s);
        }

        return "storelookup";
    }
}
