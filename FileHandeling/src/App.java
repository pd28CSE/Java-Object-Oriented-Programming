import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<Character> lista = new ArrayList<Character>();
        String st = "1234567\nabcdef\nABCDEF";

        try{
            FileOutputStream fout = new FileOutputStream("output.txt");

            for(int i=0; i<st.length(); i++){
                fout.write(st.charAt(i));
                System.out.print(st.charAt(i));
            }
            fout.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n\n\n");




        try{
            FileInputStream fin = new FileInputStream("output.txt");
            FileOutputStream fout = new FileOutputStream("Finaloutput.txt");
            int i;

            while((i=fin.read()) != -1){
                fout.write(i);
                System.out.print((char)i);
                lista.add((char)i);
            }

            fin.close();
            fout.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        

        System.out.println("\n");
        System.out.println(lista);
        
    }
}
