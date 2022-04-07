public class App {
    public static void main(String[] args){
        System.out.println("Main Start\n");

       // threadFnc();
       //  threadUseRunnable();
       threadFncWithSynchronized();
      
       
        System.out.println("Main End\n");
    }


    

    public static void threadFnc(){
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.setName("myThread1");
        myThread2.setName("myThread2");

     //   myThread1.setDaemon(true);
      //  myThread2.setDaemon(true);
        
        myThread1.setPriority(1);
        myThread2.setPriority(10);

        
        try{
            myThread1.start();
           // Thread.sleep(100);
          //  myThread1.join();
            myThread2.start();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }



    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------

    public static void threadUseRunnable(){
        MyThreadWithRunnable myThreadWithRunnable = new MyThreadWithRunnable();

        Thread myThread1 = new Thread(myThreadWithRunnable, "Runnable 1");
        Thread myThread2 = new Thread(myThreadWithRunnable, "Runnable 2");

        myThread1.start();
        myThread2.start();
    }




    // ---------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------

    public static void threadFncWithSynchronized(){
        MyClass myClass = new MyClass();

        MyThreadWithSynchronized myThreadWithSynchronized1 = new MyThreadWithSynchronized(myClass);
        MyThreadWithSynchronized myThreadWithSynchronized2 = new MyThreadWithSynchronized(myClass);

        myThreadWithSynchronized1.start();
        myThreadWithSynchronized2.start();
    }
}