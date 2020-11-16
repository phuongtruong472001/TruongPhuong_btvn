package bai1;
public class employee extends Person{
    private int salary;

    public employee() {
    }

    public employee(int salary) {
        this.salary = salary;
    }

    public employee(int salary, String Name, String Adress) {
        super(Name, Adress);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("employee name:"+getName());
        System.out.println("employee adress :"+getAdress());
        System.out.println("employee salary:"+getSalary());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
