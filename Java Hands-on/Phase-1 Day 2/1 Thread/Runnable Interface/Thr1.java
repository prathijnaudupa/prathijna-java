class Thr1 implements Runnable{  
public void run(){  
System.out.println("Example for Runnable inteface");  
}  
  
public static void main(String args[]){  
Thr1 m1=new Thr1();  
Thread t1 =new Thread(m1);   
t1.start();  
 }  
}  