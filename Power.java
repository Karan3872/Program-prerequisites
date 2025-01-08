import java.util.Scanner;
public class Power{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
     System.out.println("enter base");
	 double base;
	 base=sc.nextInt();
       System.out.println("enter exponent");
     double exponent;
    exponent=sc.nextInt();	 
	System.out.println("base to the power exponent is  "+ Math.pow(base,exponent));
  }
}