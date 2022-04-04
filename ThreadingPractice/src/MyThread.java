public class MyThread extends Thread {
    public void run() {
        System.out.println("Name : " + Thread.currentThread().getName() + " Start\nPriority : " + Thread.currentThread().getPriority());

        for(int i = 0; i <500; i++)
            System.out.println(i+1 + " " + Thread.currentThread().getName());

        System.out.println("Name : " + Thread.currentThread().getName() + " End\n\n");
    }
    
}