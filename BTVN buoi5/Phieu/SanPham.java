
package Phieu;

import java.util.Scanner;
public class SanPham {
    private String MaSP;
    private String TenSP;
    private String SoLuong;
    private String Gia;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma san pham:");
        this.MaSP=sc.nextLine();
        System.out.println("nhap ten san pham :");
        this.TenSP=sc.nextLine();
        System.out.println("nhap so luong:");
        this.SoLuong=sc.nextLine();
        System.out.println("nhap gia :");
        this.Gia=sc.nextLine();
    }
     public void output(){
        System.out.println(" ma san pham:"+this.MaSP);
        System.out.println(" ten san pham :"+this.TenSP);
        System.out.println("so luong :"+this.SoLuong);
        System.out.println(" gia :"+this.Gia);
    }

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String SoLuong, String Gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public String getGia() {
        return Gia;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }
     
}
