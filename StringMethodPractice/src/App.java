public class App {
    public static void main(String[] args){

        char ch[] = {'a', 'b', 'c', 'd', 'e'};
        String st = new String(ch);
        System.out.println(st + "\n\n");

        String s = new String(ch, 0, 2);
        System.out.println(s + "\n\n");

        String st2 = 5 + 10 + " ABC";
        System.out.println(st2 + "\n\n");

        String st3 = "XYZ " + 5 + 15;
        System.out.println(st3 + "\n\n");

        String st4 = "XYZ " + (5 + 15);
        System.out.println(st4 + "\n\n");

        String a =   "ddd " + 5 + 6 + " sfs\n\n";
        System.out.println(a);


        String b =   "ddd " + (5 + 6) + " sfs\n\n";
        System.out.println(b);


        String c =   "ddd " + 5 * 6 + " sfs\n\n";
        System.out.println(c);

        BaseClass obj = new BaseClass(10, 20);
        String st5 = "st5 " + obj;
        System.out.println(obj);
        System.out.println(st5);

        String str = "WXYZ";
        System.out.println(str.charAt(0) + "\n\n");



        String sr = "This is a_demo of the getChars method.";
        int len = sr.length();
        char ch1[] = new char[len-2];

        sr.getChars(2, len-1, ch1, 0);  //void getChars(int source_Start_index, int sourceEnd, char target[ ], int targetStart)

        String sr2 = new String(ch1);
        System.out.println(sr2 + "\n\n");





        String ab1 = "Hello";
        String ab2 = "Hello";
        String ab3 = new String("Hello");  // <<----------    allocate new memory location
        String ab4 = "HELLO";
        String ab5 = "HeLlu";
        String ab6 = new String("Hello");  // <<----------    allocate new memory location

        System.out.println(ab1 + " equals() " + ab2 + "  --> " + ab1.equals(ab2));
        System.out.println(ab1 + " equals() " + ab3 + "  --> " + ab1.equals(ab3));
        System.out.println(ab1 + " equals() " + ab4 + "  --> " + ab1.equals(ab4) + "\n\n");

        System.out.println(ab1 + " == " + ab2 + "  --> " + (ab1==ab2)); //  == .compare memory location, not String
        System.out.println(ab1 + " == " + ab3 + "  --> " + (ab1==ab3)); //  == .compare memory location, not String
        System.out.println(ab1 + " == " + ab4 + "  --> " + (ab1==ab4)); //  == .compare memory location, not String
        System.out.println(ab3 + " == " + ab6 + "  --> " + (ab3==ab6) + "\n\n"); //  == .compare memory location, not String

        System.out.println(ab1 + " equalsIgnoreCase() " + ab2 + "  --> " + ab1.equalsIgnoreCase(ab2));
        System.out.println(ab1 + " equalsIgnoreCase() " + ab3 + "  --> " + ab1.equalsIgnoreCase(ab3));
        System.out.println(ab1 + " equalsIgnoreCase() " + ab4 + "  --> " + ab1.equalsIgnoreCase(ab4));
        System.out.println(ab1 + " equalsIgnoreCase() " + ab5 + "  --> " + ab1.equalsIgnoreCase(ab5) + "\n\n");

                    //   substring
        String le = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(le.substring(1)); // starting_index to last 
        System.out.println(le.substring(10, 25) + "\n\n");  // starting_index to ending_index

        System.out.println(le.contains("s"));
        System.out.println(new String("").isEmpty());
        System.out.println("".isEmpty()+"\n\n");

        String abc = "Abc";
        String abc2 = "xycxBD";
        String abc3 = abc.concat(abc2);
        System.out.println(abc);
        System.out.println(abc2);
        System.out.println(abc3 + "\n\n");


        String abc4 = abc3.replace("cxa", "__");
        System.out.println(abc4);
        abc4 = abc3.replace("cx", "__");
        System.out.println(abc4);
        abc4 = abc3.replace('A', '-');
        System.out.println(abc4 + "\n\n");


        String aa = "abc";
        String bb = "ABC";
        String cc = "Xyz";
        String dd = String.join("", aa, bb);
        System.out.println(dd);
        dd = String.join("--", aa, bb);
        System.out.println(dd);
        String ee = String.join("--", aa, bb, cc);
        System.out.println(ee+"\n\n");




    }
}
