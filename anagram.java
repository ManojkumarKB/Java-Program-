import java.util.*;
class anagram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		String n=sc.next();
		String s=sc.next();
		int count=0;
		for(i=0;i<strlen(n);i++)
		{
			for(j=0;j<strlen(n);j++)
			{
				if(n.charAt(i)==s.charAt(j))
				count=count+1;
			}
		}
		if(count==strlen(n))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
	}
	public static int strlen(String n)
	{
		int i,count=0;
		n=n+".";
		for(i=0;n.charAt(i)!='.';i++)
			count=count+1;
		return count;
	}
}