
package DieuHoa;
import java.util.Scanner;

public class SanPham {
    private String MaSP;
    private String TenSP;
    private String TenNSX;
    private String NgayNhap;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma san pham:");
        this.MaSP=sc.nextLine();
        System.out.println("nhap ten san pham :");
        this.TenSP=sc.nextLine();
        System.out.println("nhap ten NSX:");
        this.TenNSX=sc.nextLine();
        System.out.println("nhap ngay nhap :");
        this.NgayNhap=sc.nextLine();
    }
    public void output(){
        System.out.println(" ma san pham:"+this.MaSP);
        System.out.println(" ten san pham :"+this.TenNSX);
        System.out.println(" ten NSX:"+this.TenNSX);
        System.out.println(" ngay nhap :"+this.NgayNhap);

    }
    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String TenNSX, String NgayNhap) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.TenNSX = TenNSX;
        this.NgayNhap = NgayNhap;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }
    
}
