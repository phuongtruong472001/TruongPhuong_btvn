
package bai3;

import java.util.Scanner;
public class Hang {
    private String MaHang;
    private String TenHang;
    protected int DonGia;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma hang :");
        this.MaHang=sc.nextLine();
        System.out.println("nhap ten hang :");
        this.TenHang=sc.nextLine();
        System.out.println("nhap don gia:");
        this.DonGia=sc.nextInt();
    }
    public void xuat() {
        System.out.println("ma hang :"+this.MaHang);
        System.out.println("ten hang :"+this.TenHang);
        System.out.println("don gia :"+this.DonGia);
    }

    public String getMaHang() {
        return MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
    
}
