
package LopHoc;
import java.util.Scanner;
    
public class Nguoi {
    private String HoTen;
    private String NSinh;
    private String Que;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ho ten :");
        this.HoTen=sc.nextLine();
        System.out.println("nhap ngay sinh :");
        this.NSinh=sc.nextLine();
        System.out.println("nhap que :");
        this.Que=sc.nextLine();
    }
    public void xuat(){
        System.out.println("ho tem :"+HoTen);
        System.out.println("ngay sinh :"+NSinh);
        System.out.println("que :"+Que);
    }

    public Nguoi() {
    }

    public Nguoi(String HoTen, String NSinh, String Que) {
        this.HoTen = HoTen;
        this.NSinh = NSinh;
        this.Que = Que;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "HoTen=" + HoTen + ", NSinh=" + NSinh + ", Que=" + Que + '}';
    }
    
    public String getHoTen() {
        return HoTen;
    }

    public String getNSinh() {
        return NSinh;
    }

    public String getQue() {
        return Que;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNSinh(String NSinh) {
        this.NSinh = NSinh;
    }

    public void setQue(String Que) {
        this.Que = Que;
    }
    
    
}
