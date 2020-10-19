
package bai1;

import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.printf("nhap so luong sach :");
        n=sc.nextInt();
        sach [] a=new sach[n];
        for(int i=0;i<n;i++)
        {
            a[i] = new sach();
            System.out.println("nhap thong tin cuon sach thu "+(i+1)+" :");
            a[i].nhap();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("thong tin cuon thu "+(i+1)+"la :");
            a[i].xuat();
            System.out.println("");
        }
    }
    
}
