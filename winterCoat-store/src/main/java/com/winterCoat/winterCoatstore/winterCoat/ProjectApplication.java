package com.winterCoat.winterCoatstore.winterCoat;

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.Customer;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities.WinterCoat;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces.IStore;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.CustomerService;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.ShoppingCartService;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.WinterCoatService;
import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import java.util.List;


@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@EnableJpaAuditing
//@ComponentScan("com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.spring")
//@EnableJpaRepositories("com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.spring")
//@EnableScan("edu.depaul.cdm.se.sampleproject.book.jpa")
public class ProjectApplication implements CommandLineRunner {

    @Autowired
    private WinterCoatService winterCoatService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private CustomerService customerService;

	public static void main(String[] args) {
		//ProjectApplication mainMongoDB = new ProjectApplication();

		System.out.println("__Example___");
		SpringApplication.run(ProjectApplication.class, args);

        //System.out.println("__MongoDB STARTS__");
		//mainMongoDB.showStore("60603");

        System.out.println("");

	}

    @Override
    public void run(String... args) throws Exception {

        //System.out.println("__PostgresSQL STARTS___");
//        List<WinterCoat> winterCoatList = winterCoatService.getAllWinterCoats();
//        for(WinterCoat winterCoat : winterCoatList){
//            System.out.println("Name: " + winterCoat.getName());
//        }

        //customerService.saveCustomerRaffleInfo();

		//WinterCoat winterCoat = winterCoatService.getWinterCoat((long) 11);
        //System.out.println("Name: " + winterCoat.getName());
		



    }

	//MongoDB
	private void showStore(String zip){
		StoreService service = new StoreService();
		List<IStore> stores = service.getStore(zip);

		System.out.println("");
		System.out.println("---Store collection based on zipCode: " + zip);
		for(IStore store: stores){
			System.out.println(store.getName() + ", " + store.getZip() +
					", " + store.getStreet() + ", " + store.getCity());
		}
	}


}
