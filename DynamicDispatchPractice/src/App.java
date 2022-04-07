import First.BaseClass;
import First.DerivedClass;

public class App {
    public static void main(String[] args){
        
        System.out.println("\n\nTesting Hello\n\n");
        
        BaseClass obj = new DerivedClass();

        obj.ab();
        ((DerivedClass) obj).ab();
        System.out.println("\n\n");


        obj.fnc();
        
    }
    
}   
