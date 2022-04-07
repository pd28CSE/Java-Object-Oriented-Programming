public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Implements1 obj1 = new Implements1(10);
        Implements1 obj2 = new Implements1(100);

        obj1.show();
        obj2.show();


        obj2.setA(55);
        obj2.show();
        System.out.println("\n\n");

        

        MyClass obj = new MyClass();
        obj.reset();

        


    }
}
