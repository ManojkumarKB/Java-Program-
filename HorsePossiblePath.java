import java.util.Scanner;
public class HorsePossiblePath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positon of the horse");
		System.out.println("Enter the x postion");
		int x=sc.nextInt();
		System.out.println("Enter the y postion");
		int y=sc.nextInt();
		System.out.println("-----------------");
	    for(int i=1;i<=8;i++)
	    {
	        for(int j=1;j<=9;j++)
	        {
	         	if((x==i)&&(y==(j-1)))
	           	{
	           		System.out.print("H");
	           	}
	           	if((x==(i)&&(y==j)))
	           	{
	           		System.out.print("|");
	           	}
	           	else
	           	{
	           		System.out.print("| ");
	           	}
	        }
	           System.out.println();
	           System.out.println("-----------------");
	     }
		if(((x-2>=1)&&(y-2>=1))&&(((x+2)<=8)&&((y+2)<=8)))
		{
			System.out.println("8 possible steps");
			System.exit(0);
		}
		if(check6Steps(x,y))
		{
			System.out.println("6 steps possible");
			System.exit(0);
		}
		if(check4Steps(x,y))
		{
			System.out.println("4 steps possible");
			System.exit(0);
		}
		if(check3Steps(x,y))
		{
			System.out.println("3 steps possible");
			System.exit(0);
		}
		if(check2Steps(x,y))
		{
			System.out.println("2 steps possible");
			System.exit(0);
		}
	}
	static boolean check2Steps(int x,int y)
	{
		if(((x==1)&&(y==1))||((x==8)&&(y==1))||((x==1)&&(y==8))||((x==8)&&(y==8)))
		{
			return true;
		}
		else
			return false;
	}
	static boolean check3Steps(int x,int y)
	{
		if(((x==8)&&((y==2)||(y==7)))||((x==1)&&((y==2)||(y==7)))||((y==1)&&((x==2)||(x==7)))||((y==8)&&((x==2)||(x==7))))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static boolean check4Steps(int x,int y)
	{
		if(((x==2)&&((y>=2)&&(y<=7)))||(((x==7)&&(x>=2))&&(y<=7))||((x==1)&&((y>=3)&&(y<=6))))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static boolean check6Steps(int x,int y)
	{
		if(((x==3)&&((y>=2)&&(y<=7)))||((x==4)&&((y>=2)&&(y<=7)))||((x==5)&&((y>=2)&&(y<=7)))||((x==6)&&((y>=2)&&(y<=7)))||((x==2)&&((y>=3)&&(y<=6))))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
