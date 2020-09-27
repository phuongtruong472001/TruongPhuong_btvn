/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

//import jdk.nashorn.internal.parser.Scanner;
import java.util.Scanner;
/**
 *
 * @author Luxury
 */
public class Buoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a,b;
        Scanner sc =new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(i==0 ||i==a-1||j==0 ||j==b-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    
}
