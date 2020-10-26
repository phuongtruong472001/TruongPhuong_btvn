
package SoPhuc;


public class RunMain {
    public static void main(String[] args) {
        SoPhuc p1,p2;
        p1=new SoPhuc();
        p2=new SoPhuc();
        p1.InPut();
        p2.InPut();
        SoPhuc temp=p1.tong(p2);
        temp.Output();
        temp=p1.hieu(p2);
        temp.Output();
    }
}
