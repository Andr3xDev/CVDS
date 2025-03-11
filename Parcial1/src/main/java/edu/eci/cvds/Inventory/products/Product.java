package edu.eci.cvds.Inventory.products;

public class Product {

    private String name;
    private  int price;
    private int quantity;
    private String category;

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void addQuantity(int quantity) {
        if (quantity >= 0){
            this.quantity += quantity;
        } else {
            System.out.println("Not valid");
        }
    }

    public void lessQuantity (int quantity) {
        if (quantity >= 0){
            this.quantity -= quantity;
        } else {
            System.out.println("Not valid");
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getName() {
        return this.name;
    }

}
