package bai1;

public class Person {
    private String name;
    private String dateOfBirth;
    private String genner;
    private String hobby;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String genner, String hobby) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.genner = genner;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGenner() {
        return genner;
    }

    public String getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGenner(String genner) {
        this.genner = genner;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
}
