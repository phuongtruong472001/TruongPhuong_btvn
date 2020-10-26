package bai3;
import bai3.HangHoa;
public class RunMain {
    public static void main(String[] args) {
        HangHoa HangHoa1,HangHoa2;
        HangHoa1=new HangHoa("mh1","laptop",1,7);
        HangHoa2=new HangHoa();
        HangHoa2.setMaHang("mh2");
        HangHoa2.setTenHang("pc");
        HangHoa2.setDonGia(9);
        HangHoa2.setSoLg(10);
        HangHoa1.xuat();
        HangHoa2.xuat();
    }
 
}
