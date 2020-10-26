
package DieuHoa;
import java.util.Scanner;
import java.util.ArrayList;
public class RunMain {
    public static void main(String[] args) {
        Integer n;
        Scanner sc=new Scanner (System.in);
        System.out.println("nhap n:");
        n=sc.nextInt();
        ArrayList<dieuHoa>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            dieuHoa x=new dieuHoa();
            x.input();
            list.add(x);
        }
        
        float x=list.get(0).getGia();
        for(int i=0;i<n;i++)
            if(x>list.get(i).getGia()) x=list.get(i).getGia();
        for(int i=0;i<n;i++)
            if(x==list.get(i).getGia()&& list.get(i).getTenNSX().equalsIgnoreCase("Electrolux")) 
                list.get(i).ouput();
    }
}
