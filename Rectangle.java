import java.util.Scanner;
public class Rectangle{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
     System.out.println("enter length");
	 int l;
	 l=sc.nextInt();
       System.out.println("enter width");
     int w;
     w=sc.nextInt();	 
	System.out.println("perimeter of rectangle is "+ 2*(l+w));
  }
}