public class App{
    public static void check(int a)throws UserException{
        if(a<18){
            throw new UserException("Invalid Age!!");
        }
        
        System.out.println("Thanks for Vote.");
    
    }
    public static void main(String[] args) {
        try{
            check(74);
        }
        
        catch(UserException e){
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Exception");
        }
    }
}
