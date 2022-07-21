interface Inter1{
   public static int num = 250;
   public default void display() {
      System.out.println("Details of interface 1");
   }
}
interface Inter2{
   public static int num = 200;
   public default void display() {
      System.out.println("details of Interface 2");
   }
}
public class Diamond implements Inter1, Inter2 {
   public void display() {
      Inter1.super.display();
      Inter2.super.display();
   }
   public static void main(String args[]) {
      Diamond obj = new Diamond();
      obj.display();
   }
}