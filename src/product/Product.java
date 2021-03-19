package product;

import person.Customer;
import person.Seller;

import java.util.ArrayList;

public class Product {

    // fields
    private String name;
    private String productDescription;
    private double price;
    public static ArrayList<Product> allProducts;

    // Composition
    private Category category;
    private ArrayList<Seller> allSellers;

    // Initialization Block
    static {
        allProducts = new ArrayList<>();
    } // once

    public Product(String productName, String productDescription, double price) {
        setName(productName);
        setProductDescription(productDescription);
        this.allSellers = new ArrayList<>(); // Constructor
        allProducts.add(this);
    }

    // this --> object
    // setters
    private void setName(String name) {
        this.name = name;
    }

    private void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    private void setPrice(double price) {
        this.price = price;
    } // mutable

    // getters
    public String getName() {
        return name;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    // mutable
    public void setCategory(Category category) {
        this.category = category;
    }

    public void addSeller(Seller seller) {
        this.allSellers.add(seller); // Composition
    }

    // immutable
    // field --> private
    // setter -
    // setter --> private


    public int getCategoryValue() {
        return category.getId();
    }

    public static void main(String[] args) {
        Customer customer = new Customer("ali");
//        System.out.println(customer.name); // package access
    }
}
