package com.app.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.MyData;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		  // Bulk Insert 
				/*List<Product> pds = Arrays.asList( 
						new Product(10, "G", 7.1, "MDL1", "VEN101"),
						new Product(11, "H", 8.1, "MDL2", "VEN102"), 
						new Product(12, "I", 9.1, "MDL3", "VEN103"), 
						new Product(13, "J", 1.1, "MDL4", "VEN104"), 
						new Product(14, "K", 2.1, "MDL5", "VEN105"), 
						new Product(15, "L", 3.1, "MDL6", "VEN106")
				  
				  ); 
				repo.saveAll(pds);
				System.out.println("Done");*/
		repo.findByProdCost(8.1, MyData.class).forEach(p->System.out.println(p.getProdCode()));
	}

}
