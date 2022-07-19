class Running
{ 
   public void run() 
      { 
          System.out.println("Run to win the race"); 
      } 
} 
class AccessSp 
{ 
    public static void main(String args[]) 
      { 
          Running obj = new Running (); 
          obj.run(); 
      } 
}