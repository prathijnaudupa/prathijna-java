public class Add {
  
    public double add(double x, double y)
    {
        return (x + y);
    }
 
    public static void main(String args[])
    {
        Add s = new Add();
        
        System.out.println(s.add(100.5, 120.5));
    }
}