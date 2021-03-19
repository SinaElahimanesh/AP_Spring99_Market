package person;

import java.util.ArrayList;

public class Manager {

    private String name;
    private static ArrayList<Seller> allSellers;

    static {
        allSellers = new ArrayList<>();
    }

    public Manager(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public static void addSeller(Seller seller) {
        allSellers.add(seller);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("ali");
        customer.name = "hasan";
        System.out.println(customer.name);
    }
}
