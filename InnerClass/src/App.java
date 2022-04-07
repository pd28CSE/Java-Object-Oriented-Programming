public class App {
    public static void main(String[] args) throws Exception {


        BaseClass outerobj = new BaseClass(456);
        outerobj.ShowNum1();
        outerobj.ShowPi();
        outerobj.setNum1(121);
        outerobj.info();

        BaseClass.InnerClass innerobj = outerobj.new InnerClass();

        innerobj.ShowInner();

        BaseClass.NestedInnerClass nestedinnerobj = new BaseClass.NestedInnerClass(501);

        nestedinnerobj.ShowNestedInner();
        nestedinnerobj.ShowNum3();


    }
}
