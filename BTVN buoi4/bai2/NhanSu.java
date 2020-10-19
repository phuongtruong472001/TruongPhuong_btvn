
package bai2;


import java.util.Scanner;
public class NhanSu {
    private String MaNhanSu;
    private String Ten;
    Date NS;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma nhan su :");
        this.MaNhanSu=sc.nextLine();
        System.out.println("nhap ten :");
        this.Ten=sc.nextLine();
        System.out.println("nhap ngay thang nam sinh :");
        NS=new Date();
        NS.nhap();
    }
    public void xuat(){
        System.out.println("ma nhan su :"+this.MaNhanSu);
        System.out.println("ten :"+this.Ten);
        System.out.println("ngay sinh :"+NS.toString());
    }

    public String getMaNhanSu() {
        return MaNhanSu;
    }

    public String getTen() {
        return Ten;
    }

    public Date getNS() {
        return NS;
    }

    public void setMaNhanSu(String MaNhanSu) {
        this.MaNhanSu = MaNhanSu;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setNS(Date NS) {
        this.NS = NS;
    }
    
}
