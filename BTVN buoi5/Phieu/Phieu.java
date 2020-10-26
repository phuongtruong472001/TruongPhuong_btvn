
package Phieu;
import java.util.Scanner;
import java.util.ArrayList;
public class Phieu {
    private String MaPhieu;
    private String TenPhieu;
    private DateTime a;
    private ArrayList<SanPham> x=new ArrayList<>();
   private int n;
   public void Input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("nhap ma phieu :");
       this.MaPhieu=sc.nextLine();
       System.out.println("nhap ten phieu :");
       this.TenPhieu=sc.nextLine();
       a=new DateTime();
       a.InputDate();
       System.out.println("nhap so luong san pham :");
       n=sc.nextInt();
       //x=new SanPham();
       for(int i=0;i<n;i++)
       {
           System.out.println("nhap san pham thu "+(i+1));
           SanPham sp=new SanPham();
           sp.input();
           x.add(sp);
       }
   }
   public void Output(){
       System.out.println("ma phieu :"+this.MaPhieu);
       System.out.println("ten phieu :"+this.TenPhieu);
       a.toString();
       for(int i=0;i<n;i++)
        {
            System.out.println("san pham thu "+(i+1));
            x.get(i).output();
        }
   }

    public Phieu() {
    }


    public String getMaPhieu() {
        return MaPhieu;
    }

    public String getTenPhieu() {
        return TenPhieu;
    }

    public DateTime getA() {
        return a;
    }


    public int getN() {
        return n;
    }

    public void setMaPhieu(String MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public void setTenPhieu(String TenPhieu) {
        this.TenPhieu = TenPhieu;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public void setN(int n) {
        this.n = n;
    }
   
}
