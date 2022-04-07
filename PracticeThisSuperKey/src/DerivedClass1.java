public class DerivedClass1 extends BaseClass {
    int num;

    public DerivedClass1()
    { 
        System.out.println("\n\n...............DerivedClass1 Default...............\n\n");
    }

    public DerivedClass1(String name, double pi, int num)
    {
        super(name, pi);
        this.num = num;

        System.out.println("\n\n...............DerivedClass1 Parameter...............\n\n");
    }

    @Override
    public void Show()
    {
        super.Show();
        System.out.println("num : " + num + "\n\n");
    }

    public void info()
    {
        System.out.println("--------------------------------------");
    }

}
