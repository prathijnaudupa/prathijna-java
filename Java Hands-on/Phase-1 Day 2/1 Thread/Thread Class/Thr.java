class Thr extends Thread{  
public void run(){  
System.out.println("Example for thread");  
}  
public static void main(String args[]){  
Thr t1=new Thr();  
t1.start();  
 }  
}  