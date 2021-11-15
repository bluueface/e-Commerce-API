package com.joteya;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joteya.dao.AccountRepository;
import com.joteya.dao.CategoryRepository;
import com.joteya.dao.ProductRepository;
import com.joteya.entities.Account;
import com.joteya.entities.Category;
import com.joteya.entities.Product;
/*import com.joteya.service.AccountService;*/
/*import com.joteya.entities.Role;
import com.joteya.entities.User;*/
import com.joteya.service.CategoryService;

@SpringBootApplication(scanBasePackages = { "com.joteya.entities", "com.joteya.service", "com.joteya.dao",
		"com.joteya.controllers", "com.aziz.catalogue.config" })

public class JoteyaApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryService categoryService;
	/*
	 * @Autowired private AccountService accountService;
	 */

	public static void main(String[] args) {
		SpringApplication.run(JoteyaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Category c1 = categoryRepository.save(new Category("C1"));
		Product p1 = productRepository.save(new Product("test1", "PC", 1000, c1));

		/*
		 * accountService.save(new Account("admin", "1234", 1)); accountService.save(new
		 * Account("user", "1234", 0));
		 */

		/*
		 * Role r1 = roleRepository.save(new Role("ADMIN")); Role r2 =
		 * roleRepository.save(new Role("USER"));
		 * 
		 * Set<Role> s = new HashSet<Role>(); s.add(r2); s.add(r1);
		 */

		// Set<User> s2 = new

		/*
		 * User u1 = userRepository.save(new User("blueface", "1234", "1234")); User u2
		 * = userRepository.save(new User("rober", "1234", "1234"));
		 */
		/*
		 * categoryService.addCategory(new Category("ciga"));
		 * categoryService.addCategory(new Category("Bic"));
		 * categoryService.addCategory(new Category("noooo"));
		 * 
		 * categoryService.updateCategory((long) 3, new Category("gun"));
		 * 
		 * Category c1 = categoryRepository.save(new Category("C1"));
		 * 
		 * Category c2 = categoryRepository.save(new Category("C2"));
		 * 
		 * Product p1 = productRepository.save(new Product("test1", "PC", 1000, c1));
		 * Product p2 = productRepository.save(new Product("test2", "PC", 1000, c1));
		 * Product p3 = productRepository.save(new Product("test3", "PC", 1000, c1));
		 * Product p4 = productRepository.save(new Product("test4", "PC", 1000, c1));
		 * Product p5 = productRepository.save(new Product("test5", "iPhone", 1000,
		 * c1));
		 * 
		 * Product p6 = productRepository.save(new Product("test6", "ghjjjj", 1000,
		 * c2));
		 */

		// Product product = new Product("Knife", "dddddd", 500, c2);

		// productService.addProduct(product);

		// System.out.println(productService.findProduct(p1.getId()).getDescription());
		// productService.updateProduct((long) 4,p5);
		// productService.deleteProduct((long) 3);

		// System.out.println(productService.findProductsByCtgr(c2).toString().toString());
	}

}
