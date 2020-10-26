package bai1;
import java.util.Scanner;
public class RunMain {

    public static void main(String[] args) {
        Person DoanXinhGai=new Person();
        Person DiepBueDue=new Person();
        DoanXinhGai.setName("Doan");
        DoanXinhGai.setDateOfBirth("18/08/2000");
        DoanXinhGai.setGenner("nam");
        DoanXinhGai.setHobby("co ny");
        DiepBueDue.setName("Diep");
        DiepBueDue.setDateOfBirth("26/03/2000");
        DiepBueDue.setGenner("nam");
        DiepBueDue.setHobby("oh nooooo");
        System.out.println("thong tin be Doan la:");
        System.out.println("ten:"+DoanXinhGai.getName()+",sinh nhat :"+DoanXinhGai.getDateOfBirth()+",gioi tinh:"+DoanXinhGai.getGenner()+",so thich:"+DoanXinhGai.getHobby());
        System.out.println("thong tin be Diep la :");
        System.out.println("ten:"+DiepBueDue.getName()+",sinh nhat :"+DiepBueDue.getDateOfBirth()+",gioi tinh:"+DiepBueDue.getGenner()+",so thich:"+DiepBueDue.getHobby());
       
    }
    
}
