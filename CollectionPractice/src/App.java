import java.util.*;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
      //  stackPrac();
      // queuePrac();
      //  arrayListPrac();
    }


        // -----------------------------------------------
        // -----------------------------------------------

    public static void stackPrac(){
        Stack <MyClass1> stack = new Stack<MyClass1>();


        /* Stack

        push(),
        pop(),
        peek(),
        empty(),
        search(),  // return position , not index number

        */

        MyClass1 myClass1 = new MyClass1("Partho", 8.9);
        MyClass1 myClass2 = new MyClass1("Tintin", 3.8);
        MyClass1 myClass3 = new MyClass1("Tom", 8.8);



        System.out.println(stack.empty());
        stack.push(myClass1);
        System.out.println(stack.empty());
        stack.push(myClass2);
        System.out.println(stack);
        stack.push(myClass3);
        System.out.println(stack + "\n");

        System.out.println(stack.search(myClass1));  // get position number
        System.out.println(stack.get(0));


        while(stack.empty() == false) {
            MyClass1 obj = stack.pop();
            System.out.println(obj.name + " || " + obj.scale);
        }

        System.out.println(stack.empty());
    }


    public static void queuePrac(){
        Queue <MyClass1> queue = new LinkedList<MyClass1>();

        /* queue

        add(),
        poll(),   // remove and return the head
        peek(),   // return the head
        remove(), // remove and return the head

        */

        MyClass1 myClass1 = new MyClass1("Partho", 8.9);
        MyClass1 myClass2 = new MyClass1("Tintin", 3.8);
        MyClass1 myClass3 = new MyClass1("Tom", 8.8);

        System.out.println(queue.size());
        queue.add(myClass1);
        queue.add(myClass2);
        queue.add(myClass3);

        System.out.println(queue.size());

        System.out.println(queue.peek().name + " || " + queue.peek().scale);
        MyClass1 obj = queue.poll();
        System.out.println(obj.name + " || " + obj.scale);

        MyClass1 obj2 = queue.remove();
        System.out.println(obj2.name + " || " + obj2.scale);
        
        System.out.println(queue.peek().name);

        queue.poll();

        System.out.println(queue.size());
    }

        //....................................................................
        //....................................................................

    public static void arrayListPrac(){
        ArrayList<String> arrayList = new ArrayList<String>();

        /*
           add(),
           add(index, item),
           set(index, item),
           get(index),
           size(),
           isEmpty(),
           remove(index),
           remove(item),
           contains(item), // return true if item is exists in the list, otherwise false
        */
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        arrayList.add("1st");
        System.out.println(arrayList.size());
        arrayList.add("2nd");
        arrayList.add("3rd");
        arrayList.add("4th");
        arrayList.add("5th");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty()+"\n");

        for(String st:arrayList){
            System.out.println(st);
        }

        arrayList.add(0, "6th");
        arrayList.set(2, "2ND");
        System.out.println("\n\n");
        for(String st:arrayList){
            System.out.println(st);
        }

        System.out.println("\n");

        System.out.println(arrayList.get(2) + "\n");

        arrayList.remove(2);
        for(String st:arrayList){
            System.out.println(st);
        }
        System.out.println("\n");

        arrayList.remove("3rd");
        for(String st:arrayList){
            System.out.println(st);
        }

        System.out.println("\n"+arrayList.contains("4th"));
        System.out.println(arrayList.indexOf("4th"));
        System.out.println(arrayList.indexOf("4t-h")+ "\n\n");

        
        Iterator itr = arrayList.iterator();

        while(itr.hasNext() == true){
            System.out.println(itr.next());
        }

        arrayList.clear();
        System.out.println("\n\n\n");










        ArrayList <MyClass1> arrayList1 = new ArrayList<MyClass1>();

        MyClass1 myClass1 = new MyClass1("Partho", 8.9);
        MyClass1 myClass2 = new MyClass1("Tintin", 3.8);
        MyClass1 myClass3 = new MyClass1("Tom", 8.8);

        arrayList1.add(myClass1);
        arrayList1.add(myClass2);
        arrayList1.add(myClass3);

        for(MyClass1 myClass: arrayList1){
            System.out.println(myClass.name + " || " + myClass.scale);
        }
        System.out.println("\n\n\n");


        Iterator itre = arrayList1.iterator();
        while(itre.hasNext() == true){
            MyClass1 ob = (MyClass1) itre.next();
            System.out.println(ob.name + " || " + ob.scale);
        }

    }
}