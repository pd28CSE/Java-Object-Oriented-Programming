public class Implements1 implements BaseInterface {
    int num;

    public Implements1(int a)
    {
        num = a ;
    }

    public void setA(int a)
    {
        num = a;
    }


    @Override
    public void show()
    {
        System.out.println(num + "\n");
    }
}
