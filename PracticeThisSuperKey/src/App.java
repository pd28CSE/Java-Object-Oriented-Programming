public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\n\n");

        
       
        
        
        BaseClass obj[] = new BaseClass[100];


        obj[0] = new DerivedClass1("USA", 3.1416, 888);
        obj[0].Show();

        obj[1] = new DerivedClass1("USAA", 3.1416, 8898);
        obj[1].Show();


        
    }
}
