
package bai4;
import bai4.Array;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Array arr1,arr2;
        arr1=new Array();
        arr2=new Array();
        arr1.setN(sc.nextInt());
        arr1.InputData();
        arr2.setN(sc.nextInt());
        arr2.InputData();
        int s1=arr1.sum();
        int s2=arr2.sum();
        if(s1/arr1.getN()>s2/arr2.getN()) 
            System.out.println("tbc cua arr1 lon hon arr2");
        if(s1/arr1.getN()<s2/arr2.getN()) 
            System.out.println("tbc cua arr1 nho hon arr2");
        if(s1/arr1.getN()==s2/arr2.getN()) 
            System.out.println("hi");
    }
}
