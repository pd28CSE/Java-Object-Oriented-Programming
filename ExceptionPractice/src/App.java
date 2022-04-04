import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args){


        try{
            System.out.println(fnc(10, 0));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage() + " 0");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage() + "  Index");
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage() + " RuntimeException");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    static int fnc(int a, int b)throws IOException, SQLException{
        if(b > 20){
            throw new IOException("File Not Found");
        }
        else if(b > 10){
            throw new SQLException("Database Error");
        }
        else if(b < 1){
            throw new ArithmeticException("Zero Division Error");
        }
        else if(b==1){
            throw new NullPointerException("Null Error");
        }
        return a/b;
    }
}

/* 

    unchecked exception ==> RurntimeException  (run time check)
    checked exception ==> (Compile time check)
    

*/