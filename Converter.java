import java.util.Scanner;
public class Converter{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
     System.out.println("enter temperature in celsius");
	 int a;
	 a=sc.nextInt();
	 System.out.println((a*9/5)+32);
  }
}