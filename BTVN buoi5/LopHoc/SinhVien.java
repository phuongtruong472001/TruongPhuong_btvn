
package LopHoc;
import java.util.Scanner;
public class SinhVien extends Nguoi{
   private String MaSV;
   private String Nganh;
   private String KhoaHoc;
   public void input(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("nhap ma sinh vien :");
        MaSV=sc.nextLine();
        System.out.println("nhap nganh :");
        Nganh=sc.nextLine();
        System.out.println("nhap khoa hoc :");
        KhoaHoc=sc.nextLine();
                
   }
   @Override
    public String toString() {
        return "SinhVien{" +super.toString()+ "MaSV=" + MaSV + ", Nganh=" + Nganh + ", KhoaHoc=" + KhoaHoc + '}';
    }
    public SinhVien() {
    }

    public SinhVien(String MaSV, String Nganh, String KhoaHoc, String HoTen, String NSinh, String Que) {
        super(HoTen, NSinh, Que);
        this.MaSV = MaSV;
        this.Nganh = Nganh;
        this.KhoaHoc = KhoaHoc;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public String getKhoaHoc() {
        return KhoaHoc;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public void setKhoaHoc(String KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }
}
