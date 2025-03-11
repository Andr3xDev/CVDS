package edu.eci.cvds.Inventory.products;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void mustCreateProduct() {
        Product product = new Product( "Xbox one", 10, 2, "consola");
        assertNotNull(product);
    }

    @Test
    public void shouldAddQuantity() {
        Product product = new Product("Xbox one", 10, 2, "consola");
        product.addQuantity(3);
        assertEquals(5, product.getQuantity());
    }

    @Test
    public void shouldNotAddQuantity() {
        Product product = new Product("Xbox one", 10, 2, "consola");
        product.addQuantity(-3);
        assertEquals(2, product.getQuantity());
    }

    @Test
    public void shouldLessQuantity() {
        Product product = new Product("Xbox one", 10, 5, "consola");
        product.lessQuantity(3);
        assertEquals(2, product.getQuantity());
    }
    @Test
    public void shouldNotLessQuantity() {
        Product product = new Product("Xbox one", 10, 2, "consola");
        product.lessQuantity(-3);
        assertEquals(2, product.getQuantity());
    }

    @Test
    public void shouldGetQuantity() {
        Product product = new Product("Xbox one", 10, 5, "consola");
        assertEquals(5, product.getQuantity());
    }

    @Test
    public void shouldGetName() {
        Product product = new Product("Xbox one", 10, 5, "consola");
        assertEquals("Xbox one", product.getName());
    }

}