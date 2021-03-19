package person;

public class Customer {
    String name; // package access
    private double credit; // private

    public Customer(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public void depositMoney(double money) {
        credit += money;
    }

    public Credit drawMoney(double money) {
        if(credit >= money) {
            credit -= money;
            return Credit.SUCCESSFUL;
        } else {
            return Credit.NOT_HAVE_ENOUGH_MONEY;
        }
    }
}
