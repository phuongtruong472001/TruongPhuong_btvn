
package bai3;
import bai3.Hang;
import java.util.Scanner;
public class Phieu {
    private String MaPhieu;
    Hang []x;
    private int n;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma phieu :");
        this.MaPhieu=sc.nextLine();
        System.out.println("nhap so hang :");
        this.n=sc.nextInt();
        x=new Hang[n];
        for(int i=0;i<n;i++)
        {
            x[i]=new Hang();
            System.out.println("nhap hang thu"+(i+1)+" :");
            x[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("ma phieu la :"+this.MaPhieu);
        System.out.println("thong tin cac mat hang la --------------");
        for(int i=0;i<n;i++)
        {
            System.out.println("thong tin hang thu "+(i+1)+"la :");
            x[i].xuat();
        }
    }
    public void TinhTien(){
        int s=0;
        for(int i=0;i<n;i++)
            s+=x[i].DonGia;
        System.out.println("tong don gia cua phieu la :"+s);
    }
    public String getMaPhieu() {
        return MaPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public void setMaPhieu(String MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}
