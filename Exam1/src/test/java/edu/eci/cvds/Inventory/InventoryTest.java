package edu.eci.cvds.Inventory;

import edu.eci.cvds.Inventory.products.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    @Test
    public void mustCreateInvetory() {
        InventoryApplication inventory = new InventoryApplication();
        assertNotNull(inventory);
    }

    @Test
    public void shouldAddProduct() {
        InventoryApplication inventory = new InventoryApplication();
        Product product = new Product("Xbox one", 10, 2, "consola");
        inventory.addProduct(product);
        assertNotNull(inventory.searchProduct(product));
    }

    @Test
    public void shouldAddProduct2() {
        InventoryApplication inventory = new InventoryApplication();
        Product product = new Product("Xbox one", 10, 2, "consola");
        inventory.addProduct(product);
        inventory.addProduct(product);
        assertNotNull(inventory.searchProduct(product));
    }

    @Test
    public void shouldSearchProduct() {
        InventoryApplication inventory = new InventoryApplication();
        Product product = new Product("Xbox one", 10, 2, "consola");
        inventory.addProduct(product);
        Product product2 = inventory.searchProduct(product);
        assertNotNull(product2);
    }

    @Test
    public void shouldNotSearchProduct() {
        InventoryApplication inventory = new InventoryApplication();
        Product product = new Product("Xbox one", 10, 2, "consola");
        Product product2 = inventory.searchProduct(product);
        assertNull(product2);
    }
    @Test
    public void shouldRemoveProduct() {
        InventoryApplication inventory = new InventoryApplication();
        Product product = new Product("Xbox one", 10, 2, "consola");
        inventory.addProduct(product);
        inventory.removeProduct(product);
        assertNull(inventory.searchProduct(product));
    }
    @Test
    public void shouldSellProduct() {
        InventoryApplication inventory = new InventoryApplication();
        Product product = new Product("Xbox one", 10, 0, "consola");
        inventory.addProduct(product);
        inventory.sellProduct(product, 1);
        assertNull(inventory.searchProduct(product));
    }

    @Test
    public void shouldSellProductExist() {
        InventoryApplication inventory = new InventoryApplication();
        Product product = new Product("Xbox one", 10, 2, "consola");
        inventory.addProduct(product);
        inventory.sellProduct(product, 1);
        assertEquals(1, product.getQuantity());
    }

}