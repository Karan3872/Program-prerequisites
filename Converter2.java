import java.util.Scanner;
public class Converter2{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
     System.out.println("enter distance in kilometers");
	 int distance;
	 distance=sc.nextInt();
	 System.out.println("miles is "+distance*0.621371);
  }
}