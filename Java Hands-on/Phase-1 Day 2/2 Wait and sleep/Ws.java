class Ws  
{   
  
    private static Object obj = new Object();   
  
    public static void main(String[] args)throws InterruptedException   
    {   
  
        Thread.sleep(2000);   
      
        System.out.println( Thread.currentThread().getName() +   
        " Thread sleep");   
  
        synchronized (obj)    
        {   
   
            obj.wait(2000);   
  
            System.out.println(obj + " Thread wait");   
        }   
    }   
}  