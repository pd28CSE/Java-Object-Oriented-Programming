public class MyThreadWithRunnable implements Runnable{
    public void run(){
        System.out.println("Name : " + Thread.currentThread().getName() + " Start");

        for(int i = 0; i <20; i++)
            System.out.println(i+1 + "   " + Thread.currentThread().getName());

        System.out.println("Name : " + Thread.currentThread().getName() + " End\n");
    }
}