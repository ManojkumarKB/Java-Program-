//Given a string str and an integer k find the lexicographically smallest and largest substrings of length k.
import java.util.Arrays;
import java.util.Scanner;

public class substring2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String s=sc.next();
			System.out.println("Enter the integer");
			int n=sc.nextInt();
			String[] subStr=findSubstring(s,n);
			System.out.println(subStr[0]);
			Arrays.sort(subStr);
			System.out.println("The smallest string is "+subStr[0]);
			System.out.println("The greatest string is "+subStr[subStr.length-1]);
			
		}
		static String[] findSubstring(String s,int n)
		{
			int l=s.length();
			String str[]=new String[l-2];
			for(int i=0;i<l-(n-1);i++)
			{
				str[i]=s.substring(i,i+n);
				//System.out.println(str[i]);
			}
			for(String f:str)
				System.out.println(f);
			return str;
		}
	}
