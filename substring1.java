import java.util.Scanner;

// Given a string print the substrings of the string of integer k and print it
public class substring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println("Enter the integer");
		int n=sc.nextInt();
		findSubstring(s,n);
		
	}
	static void findSubstring(String s,int n)
	{
		int l=s.length();
		for(int i=0;i<l-(n-1);i++)
		{
			System.out.println(s.substring(i,i+n));
		}
	}
}
