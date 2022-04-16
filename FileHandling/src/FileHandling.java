import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {


    public static void main(String[] args){
        FileInputStream fin;
        FileOutputStream fout;
        int k=0;
        try{
            fout = new FileOutputStream("Output.txt");
            fin = new FileInputStream("FinalOutput.txt");
            int a;
            while((a=fin.read()) != -1){
                fout.write(a);
                System.out.print((char)a);
                k++;
            }
            fin.close();
            fout.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.print("\n\n" + k);
    }
}