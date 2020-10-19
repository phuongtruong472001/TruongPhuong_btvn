package bai4;

import java.util.Scanner;

public class QuanLy {
    String maql;
    String hoTen;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaql(String maql) {
        this.maql = maql;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaql() {
        return maql;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma ql: ");
        maql = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
       
    }
    
    public void Xuat()
    {
        System.out.println("Ma ql: " + maql + ", ho ten: " + hoTen);
    }
    
}
