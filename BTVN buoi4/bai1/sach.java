
package bai1;
import java.util.Scanner;

public class sach {
    Scanner sc=new Scanner(System.in);
    private String MaSach;
    private String TenSach;
    private String NXBSach;
    private int SoTrang;
    private float Gia;

    public sach() {
    }

    public sach(String MaSach, String TenSach, String NXBSach, int SoTrang, float Gia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.NXBSach = NXBSach;
        this.SoTrang = SoTrang;
        this.Gia = Gia;
    }

    public String getMaSach() {
        return MaSach;
    }
    public void nhap(){
        
        System.out.println("nhap ma sach :" );
        this.MaSach=sc.nextLine();
        System.out.println("nhap ten sach :");
        this.TenSach=sc.nextLine();
        System.out.println("nhap NXB sach:");
        this.NXBSach=sc.nextLine();
        System.out.println("nhap so trang :");
        this.SoTrang=sc.nextInt();
        System.out.println("nhap gia :");
        this.Gia=sc.nextFloat();
        
    }
    public void xuat(){
        System.out.println("ma sach :"+this.MaSach);
        System.out.println("ten sach :"+this.TenSach);
        System.out.println("NXB :"+this.NXBSach);
        System.out.println("so trang :"+this.SoTrang);
        System.out.println("gia :"+this.Gia);
    }
    public String getTenSach() {
        return TenSach;
    }

    public String getNXBSach() {
        return NXBSach;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public float getGia() {
        return Gia;
    }
    

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }
    
    public void setNXBSach(String NXBSach) {
        this.NXBSach = NXBSach;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
    
    
    
}
