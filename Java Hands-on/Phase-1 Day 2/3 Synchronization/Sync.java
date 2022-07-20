class Syncc{  
void printTable(int n){ 
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(2000);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class Thread1 extends Thread{  
Syncc t;  
Thread1(Syncc t){  
this.t=t;  
}  
public void run(){  
t.printTable(6);  
}  
  
}  
class Thread2 extends Thread{  
Syncc t;  
Thread2(Syncc t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class Sync{  
public static void main(String args[]){  
Syncc obj = new Syncc(); 
Thread1 t1=new Thread1(obj);  
Thread2 t2=new Thread2(obj);  
t1.start();  
t2.start();  
}  
}  