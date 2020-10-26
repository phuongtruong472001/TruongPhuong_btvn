
package LopHoc;
import java.util.Scanner;
import java.util.ArrayList;
public class LopHoc {
    private String MaLH;
    private String TenLH;
    private String NgayMo;
    private ArrayList<SinhVien> x=new ArrayList<>();
    private int n;
    private String GiaoVien;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma LH:");
        MaLH=sc.nextLine();
        System.out.println("nhap ten LH :");
        TenLH=sc.nextLine();
        System.out.println("nhap ngay mo :");
        NgayMo=sc.nextLine();
        System.out.println("nhap so luong sinh vien :");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap thong tin sinh vien "+(i+1));
            SinhVien temp=new SinhVien();
            temp.input();
            x.add(temp);
            
        }
    }
    public void output(){
        System.out.println("ma LH :"+MaLH);
        System.out.println("ten LH :"+TenLH);
        System.out.println("ngay mo :"+NgayMo);
        System.out.println("thong tin cac sinh vien trong lop la ---------");
        for(int i=0;i<n;i++)
        {
            System.out.println("thong tin sinh vien "+(i+1)+x.get(i).toString());
            
            
        }
    }
    public LopHoc() {
    }

    public LopHoc(String MaLH, String TenLH, String NgayMo, int n, String GiaoVien) {
        this.MaLH = MaLH;
        this.TenLH = TenLH;
        this.NgayMo = NgayMo;
        this.n = n;
        this.GiaoVien = GiaoVien;
    }

    public String getMaLH() {
        return MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public void setNgayMo(String NgayMo) {
        this.NgayMo = NgayMo;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setGiaoVien(String GiaoVien) {
        this.GiaoVien = GiaoVien;
    }
    
}
