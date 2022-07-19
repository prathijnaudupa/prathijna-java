import java.util.Scanner;  
public class PosNeg  
{  
public static void main (String args[])  
{     
Scanner scan=new Scanner(System.in);  
System.out.print("Enter the number to check positive or negative or zero: ");  
int num=scan.nextInt();  
 
checkk(num);  
}  

public static void checkk(int num)  
{  
  
if(num>=0)   
System.out.println(num+" is positive");   
else   
System.out.println(num+" is negative");  
}  
}  