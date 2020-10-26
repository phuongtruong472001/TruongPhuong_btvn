
package bai5;

public class RunMain {
    public static void main(String[] args) {
        Guns t1 = new Guns("t1", 40);
        Guns t2 = new Guns("t2",30);
        while (t1.getAmmoNumber() >0 && t2.getAmmoNumber()>0){
            t1.Load(5);
            t1.Shoot(7);
            t2.Load(10);
            t2.Shoot(3);
        }
        if (t1.getAmmoNumber()==0){
            System.out.println("t1 win");
        }else System.out.println("t2 win");
        
    }
}
