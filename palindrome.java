
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=s.nextLine();
		String reverse=new StringBuffer(str).reverse().toString();
		if(str.equals(reverse))
		{
			 System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not  a palindrome");
		}
		

	}
}