class Customm extends Exception {
    public Customm(String s)
    {
       
        super(s);
    }
}
 public class Custom {
    
    public static void main(String args[])
    {
        try {
          
            throw new Customm("error");
        }
        catch (Customm ex) {
            System.out.println("Caught");
 
            System.out.println(ex.getMessage());
        }
    }
}