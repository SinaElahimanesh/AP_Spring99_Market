import person.Credit;
import person.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("ali");
        Credit credit = customer.drawMoney(10);
//        System.out.println(credit.getValue());
        System.out.println(credit);
    }
}
