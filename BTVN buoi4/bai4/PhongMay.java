package bai4;

import java.util.Scanner;

public class PhongMay {
    String maPhong;
    String tenPhong;
    float dienTich;
    QuanLy x;
    May y[];
    int n;

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public float getDienTich() {
        return dienTich;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public int getN() {
        return n;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public May[] getY() {
        return y;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        dienTich = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap quan ly: ");
        x = new QuanLy();
        x.Nhap();
        System.out.println("Nhap so may tinh: ");
        n = sc.nextInt();
        System.out.println("Nhap thong tin cac may tinh: ");
        y = new May[n];
        for (int i=0;i<n;i++)
        {
            y[i] = new May();
            y[i].Nhap();
        }
    }

    public void Xuat()
    {
        System.out.println("Ma phong: " + maPhong + ", ten phong: " + tenPhong + ", dien tich:" + dienTich);
        x.Xuat();
        for (int i=0;i<n;i++)
        {
            y[i].Xuat();
        }
    }
    
}
