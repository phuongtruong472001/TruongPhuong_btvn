
package bai1;
public class Customer extends Person{
    private int balance;

    public Customer() {
    }

    public Customer(int balance) {
        this.balance = balance;
    }

    public Customer(int balance, String Name, String Adress) {
        super(Name, Adress);
        this.balance = balance;
    }
    @Override
    public void display()
    {
        System.out.println("customer name:"+super.getName());
        System.out.println("customer adress :"+super.getAdress());
        System.out.println("customer balance:"+balance);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
