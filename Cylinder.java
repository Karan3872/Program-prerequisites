import java.util.Scanner;
public class Cylinder{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
     System.out.println("enter radius");
	 int a;
	 a=sc.nextInt();
       System.out.println("enter height");
     int b;
     b=sc.nextInt();	 
	System.out.println(3.14*(a*a)*b);
  }
}