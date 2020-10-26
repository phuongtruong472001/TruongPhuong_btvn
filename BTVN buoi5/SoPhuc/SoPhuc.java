
package SoPhuc;

import java.util.Scanner;
public class SoPhuc {
    private int PhanThuc;
    private int PhanAo;
    public void InPut(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap phan thuc :");
        this.PhanThuc=sc.nextInt();
        System.out.println("nhap phan ao :");
        this.PhanAo=sc.nextInt();
    }
    public void Output(){
        System.out.println("so phuc la :"+this.PhanThuc+"+"+"i*"+this.PhanAo);
        
    }
    public SoPhuc tong(SoPhuc x){
        SoPhuc temp=new SoPhuc();
        temp.PhanThuc=this.PhanThuc+x.PhanThuc;
        temp.PhanAo=this.PhanAo+x.PhanAo;
        return temp;
    }
    public SoPhuc hieu(SoPhuc x){
        SoPhuc temp=new SoPhuc();
        temp.PhanThuc=this.PhanThuc-x.PhanThuc;
        temp.PhanAo=this.PhanAo-x.PhanAo;
        return temp;
    }
    public SoPhuc() {
    }

    public SoPhuc(int PhanThuc, int PhanAo) {
        this.PhanThuc = PhanThuc;
        this.PhanAo = PhanAo;
    }

    public int getPhanThuc() {
        return PhanThuc;
    }

    public int getPhanAo() {
        return PhanAo;
    }

    public void setPhanThuc(int PhanThuc) {
        this.PhanThuc = PhanThuc;
    }

    public void setPhanAo(int PhanAo) {
        this.PhanAo = PhanAo;
    }
    
}
