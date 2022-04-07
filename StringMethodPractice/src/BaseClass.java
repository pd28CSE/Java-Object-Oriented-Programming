public class BaseClass {
    private int a, b;

    public BaseClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        System.out.println("\n\nCall toString Method\n\n");
        return "Use toString Function. a = " + a + "   b = " + b + "\n\n";
    }
}
