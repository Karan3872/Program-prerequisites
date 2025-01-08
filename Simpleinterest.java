import java.util.Scanner;
public class Simpleinterest{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
     System.out.println("enter principle");
	 int p;
	 p=sc.nextInt();
       System.out.println("enter rate");
     int r;
     r=sc.nextInt();	 
	 System.out.println("enter time");
	 int t;
	 t=sc.nextInt();
	System.out.println("Simple interest is "+ (p*r*t/100));
  }
}