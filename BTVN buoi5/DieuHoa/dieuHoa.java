
package DieuHoa;
import java.util.Scanner;
public class dieuHoa extends SanPham{
    private float CongSuat,Gia;

    public dieuHoa() {
    }


    public dieuHoa(float CongSuat, float Gia, String MaSP, String TenSP, String TenNSX, String NgayNhap) {
        super(MaSP, TenSP, TenNSX, NgayNhap);
        this.CongSuat = CongSuat;
        this.Gia = Gia;
    }

    @Override
    public String toString() {
        return "dieuHoa{" +super.toString()+ "CongSuat=" + CongSuat + ", Gia=" + Gia + '}';
    }
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap cong suat :");
        this.CongSuat=sc.nextFloat();
        System.out.println("nhap gia :");
        this.Gia=sc.nextFloat();
    }
    public void ouput(){
        super.output();
        System.out.println(" cong suat :"+CongSuat);
        
        System.out.println("gia :"+Gia);
    }

    public float getCongSuat() {
        return CongSuat;
    }

    public float getGia() {
        return Gia;
    }

    public void setCongSuat(float CongSuat) {
        this.CongSuat = CongSuat;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
    
}
