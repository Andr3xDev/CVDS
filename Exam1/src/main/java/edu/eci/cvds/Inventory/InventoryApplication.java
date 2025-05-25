package edu.eci.cvds.Inventory;

import edu.eci.cvds.Inventory.products.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class InventoryApplication {

	private ArrayList<Product> products;

	InventoryApplication() {
		this.products = new ArrayList<Product>();
	}

	public Product searchProduct(Product productObjetive) {
		for(Product p : products){
			if(p == productObjetive ){
				return productObjetive;
			}
		}
		return null;
	}

	public void addProduct(Product product) {
		Product search = searchProduct(product);
		if (search == null) {
			this.products.add(product);
		} else {
			product.addQuantity(1);
		}
	}

	public void sellProduct(Product product, int quantity) {
		Product search = searchProduct(product);
		if (search != null ) {
			if (search.getQuantity() > 0){
				product.lessQuantity(quantity);
			} else {
				this.products.remove(product);
			}
		}
	}

	public void removeProduct(Product product) {
		Product search = searchProduct(product);
		if (search != null) {
			this.products.remove(search);
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
}
