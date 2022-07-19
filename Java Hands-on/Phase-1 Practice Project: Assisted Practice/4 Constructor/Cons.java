class Hello {
   int x;
   
   Hello(int i ) {
      x = i;
   }
}

public class Cons {
   public static void main(String args[]) {
   //Parameterized constructor
      Hello t1 = new Hello( 200 );
      Hello t2 = new Hello( 300 );
      System.out.println("Example of Parameterized constructor");
      System.out.println(t1.x + " " + t2.x);
   }
}