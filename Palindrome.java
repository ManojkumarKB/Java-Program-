import java.util.Scanner;

//Check whether the given string is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to find the palindrome");
		String s=sc.next();
		String r=findRev(s);
		if(s.equalsIgnoreCase(r))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	static String findRev(String s)
	{
		String r="";
		for(int i=s.length()-1;i>=0;i--)
			r=r+s.charAt(i);
		return r;
	}

}
