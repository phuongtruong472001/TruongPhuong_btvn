
package bai1;
public abstract class Person {
    private String Name;
    private  String Adress;

    public Person() {
    }

    public Person(String Name, String Adress) {
        this.Name = Name;
        this.Adress = Adress;
    }

    public String getName() {
        return Name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
    
    public abstract void display();
}
