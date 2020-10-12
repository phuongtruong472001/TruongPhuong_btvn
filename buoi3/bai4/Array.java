
package bai4;
import java.util.Scanner;

public class Array {
    Scanner sc=new Scanner(System.in);
    private int n;
    private int []a;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void InputData(){
        a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
    }
    public void show(){
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public int sum(){
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        return sum;
    }

    public Array() {
    }

    public Array(int n, int[] a) {
        this.n = n;
        this.a = a;
    }       
}
