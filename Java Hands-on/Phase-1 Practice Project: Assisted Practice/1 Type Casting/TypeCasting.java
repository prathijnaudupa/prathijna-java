public class TypeCasting {
	public static void main(String []args)
	{
		System.out.println("Implicit and Eexplicit Type casting");
		System.out.println("Implicit: Convertion done by JVM");
		int a = 17;
		double b = a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("***********************");
		
		System.out.println("Explicit: Convertion done by programmers");
		double x = 89.00;
		int y = (int)x;
		System.out.println(x);
		System.out.println(y);
		
	}
}
