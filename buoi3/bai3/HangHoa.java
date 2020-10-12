
package bai3;


public class HangHoa {
    private String MaHang;
    private String TenHang;
    private float DonGia;
    private int SoLg;

    public HangHoa() {
    }
    
    public HangHoa(String MaHang, String TenHang, float DonGia, int SoLg) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.DonGia = DonGia;
        this.SoLg = SoLg;
    }

    public String getMaHang() {
        return MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public float getDonGia() {
        return DonGia;
    }

    public int getSoLg() {
        return SoLg;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public void setSoLg(int SoLg) {
        this.SoLg = SoLg;
    }
    public void xuat(){
        System.out.println("thong tin mat hang la :");
        System.out.println("ma hang :"+MaHang+",ten hang :"+TenHang+",don gia:"+DonGia+",so luong :"+SoLg+",thanh tien :"+DonGia*SoLg);
    }
            
}
