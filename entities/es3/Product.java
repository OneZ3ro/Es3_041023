package entities.es3;

import java.util.Random;

public class Product {
    private int codeProduct;
    private String description;
    private double price;
    private int available;

    public Product(String description, double price, int available){
        Random rndm = new Random();
        this.codeProduct = rndm.nextInt(1, 1000);
        this.description = description;
        this.price = price;
        this.available = available;
    }
}
