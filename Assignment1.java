import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[args.length];
		System.out.println("The three numbers at command line are:");
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			System.out.println(arr[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("1)The sum of given numbers is:"+sum(arr));
		System.out.println("2)The greatest number between 15,25,60 using ternary is "+greater(15,25,60));
		System.out.println("3)The greatest number for 15,25,60 using &&: "+greaterif(15,60,45));
		System.out.println("4)The even numbers between 1 to 2:");
		evenno();
		System.out.println(" Enter the three marks");
		for(int i=0;i<3;i++)
			arr[i]=sc.nextInt();
		grade(arr);
		System.out.println("6)Two dimensional array in command line:");
		dim2(arr);
		System.out.println("Enter the four integer values to find the greater value");
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("7)The greater number in an array:"+bigArray(arr));
		System.out.println("8)Enter the day with first letter as caps to find the weekend:");
		String day=sc.next();
		if(checkWeekend(day))
			System.out.println(day+"is a weekend");
		else
			System.out.println(day+"is a weekday");
		System.out.println("9)To check the particular number is available or not");
		String[] str={"Mano","Kumar","Ram","Ramesh","Surech","Kalam"};
		System.out.println("Enter the name to check in the string array contains \"Mano\",\"Kumar\",\"Ram\",\"Ramesh\",\"Suresh\",\"Kalan\"");
		String k=sc.next();
		if(strCheck(str,k))
			System.out.println("Present");
		else
			System.out.println("Absent");
		System.out.println("Enter the any value to print the star pattern");
		int n=sc.nextInt();
		pattern(n);
		System.out.println("pattern a");
		patterna(4);
		System.out.println("pattern b");
		patternb(4);
		System.out.println("Pattern c");
		patternc(4);
	}
	static int sum(int[] n)
	{
		int sum=0;
		for(int i=0;i<4;i++)
			sum=n[i]+sum;
		return sum;
	}
	static int greater(int a,int b,int c)
	{
		return a>b?((a>c)?a:c):((b>c)?b:c);
	}
	static int greaterif(int a,int b,int c)
	{
		if((a>b)&&(a>c))
		{
			return a;
		}
		else if((b>a)&&(b>c))
		{
			return b;
		}
		else
			return c;
	}
	static void evenno()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
	}
	static void grade(int[] m)
	{
	   int s=sum(m);
	   float avg=(s/3);
	   System.out.print("5)The grade:");
	   if(avg<35)
		   System.out.println("F");
	   else if((avg>=35)&&(avg<50))
			System.out.println("E");
	   else if((avg>=50)&&(avg<60))
		   System.out.println("D");
	   else if((avg>=60)&&(avg<70))
		   System.out.println(("C"));
	   else if((avg>=70)&&(avg<80))
		   System.out.println("B");
	   else if((avg>=80)&&(avg<90))
		   System.out.println("A");
	   else
		   System.out.println("S");	
	}
	static void dim2(int[] n)
	{
		int[][] arr=new int[2][2];
		int c=4;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=n[c++];
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}
	static int bigArray(int n[])
	{
		int max=0;
		for(int i=0;i<4;i++)
			if(max<n[i])
				max=n[i];
	    return max;
	}
	static boolean checkWeekend(String d)
	{
		switch(d)
		{
		case "Sunday":
			return true;
		case "Saturday":
			return true;
		default:
			return false;
		}
	}
	static boolean strCheck(String s[],String key)
	{
		for(int i=0;i<s.length;i++)
		{
			if(key.equalsIgnoreCase(s[i]))
			{
				return true;
			}
		}
		return false;
	}
	static void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void patterna(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	static void patternb(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}
	static void patternc(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			c=1;
			System.out.println();
		}
	}
}
