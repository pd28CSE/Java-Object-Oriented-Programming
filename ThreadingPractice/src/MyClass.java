public class MyClass {
    public synchronized void fnc(){
        System.out.println("fnc Start\n");
        for (int i = 0; i <20; i++) {
            System.out.println(i+1);
        }

        System.out.println("\nfnc end\n");
    }
}