package bai4;

import java.util.Scanner;

public class May {
    String maMay;
    String kieuMay;
    String tinhTrang;

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public String getMaMay() {
        return maMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma may: ");
        maMay = sc.nextLine();
        System.out.println("Nhap kieu may: ");
        kieuMay = sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
    }
    
    public void Xuat()
    {
        System.out.println("Ma may: " + maMay + ", kieu may: " + kieuMay + ", tinh trang: " + tinhTrang);
    }
}
