public abstract class BaseClass {
    String name;
    double pi;


    public BaseClass()
    {
        System.out.println("\n\n...............BaseClass Default...............\n\n");
    }


    public BaseClass(String name, double pi) {
        this.name = name;
        this.pi = pi;
        System.out.println("\n\n...............BaseClass Parameter...............\n\n");
    }

    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getPi() {
        return pi;
    }


    public void setPi(double pi) {
        this.pi = pi;
    }

    public void Show()
    {
        System.out.println("\nname : " + name);
        System.out.println("pi : " + pi + "\n\n");
    }
}
