
package Phieu;

import java.util.Scanner;
public class DateTime {
    private int ngay;
    private int thang;
    private int nam;
    public void InputDate(){
        Scanner sc=new Scanner (System.in);
        System.out.println("nhap ngay,thang nam :");
        this.ngay=sc.nextInt();
        this.thang=sc.nextInt();
        this.nam=sc.nextInt();
    }
    public void OutputDate(){
        System.out.println("DateTime :"+this.ngay+"/");
    }

    @Override
    public String toString() {
        return "DateTime{" + "/" + ngay + "/" + thang + "/" + nam + '}';
    }

    public DateTime() {
    }

    public DateTime(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
}
