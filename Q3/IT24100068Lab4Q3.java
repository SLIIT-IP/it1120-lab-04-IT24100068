import java.util.Scanner;
public class IT24100068Lab4Q3{
	public static void main(String[]args){

	int num;
	String result;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number: ");
	num = scanner.nextInt();

	result = (num>0) ? " The number is: Positive" : (num<0) ? "the number is: Negative" : "The number is zero";
	
	System.out.println(result);
   }
}
