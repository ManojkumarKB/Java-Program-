import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"Manoj","Kumar","Ramesh","Ram","Arun"};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name you want to search");
		String k=sc.next();
		int flag=0;
		for(int i=0;i<str.length;i++)
		{
			if(k.equalsIgnoreCase(k))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Present");
		else
			System.out.println("Absent");
	}
}
