
package bai2;

public class Dog {
    private String name;
    private static int MP=100;
    public void InputName(String name){
        this.name=name;
    }
    public void ShowMP(){
        MP-=20;
    }
    public void Bark(){
        if(name==null||name.isEmpty() )
            System.out.println("xin loi ban chua dien ten");
        else
            System.out.println(name+" sủa "+MP);
        
    }

    
}
