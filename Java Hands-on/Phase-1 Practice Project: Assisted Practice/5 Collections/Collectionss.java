import java.util.*;  
class Collectionss{  
public static void main(String args[]){  
ArrayList<String> one=new ArrayList<String>();  
one.add("orange"); 
one.add("apple");  
one.add("jack fruit");  
one.add("grapes");  
Iterator itr=one.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  