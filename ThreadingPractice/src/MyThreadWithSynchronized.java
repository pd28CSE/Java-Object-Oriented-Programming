public class MyThreadWithSynchronized extends Thread {
    private MyClass myClass;

    public MyThreadWithSynchronized(MyClass myClass) {
        this.myClass = myClass;
    }

    public void run() {
        System.out.println("Name : " + Thread.currentThread().getName() + " Start");

        myClass.fnc();
        
        System.out.println("Name : " + Thread.currentThread().getName() + " End");
    }    
}