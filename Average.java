import java.util.Scanner;
public class Average{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
     System.out.println("enter num1");
	 int num1;
	 num1=sc.nextInt();
       System.out.println("enter num2");
     int num2;
     num2=sc.nextInt();	 
	 System.out.println("enter num3");
	 int num3;
	 num3=sc.nextInt();
	System.out.println("Average of three number "+ (num1+num2+num3)/3);
  }
}