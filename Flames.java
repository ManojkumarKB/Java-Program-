import java.util.Scanner;
public class Flames {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   // System.out.println("From Friends  Affectionate  Enemy  Sisters Brothers");
	    System.out.println("           FLAMES       ");
		System.out.print("Enter the first name: ");
		String s1=sc.next().toLowerCase();
		System.out.print("Enter the second name: ");
		String s2=sc.next().toLowerCase();
		String str=(s1+s2);
		String remDup=removeDup(s1,s2);
		int h=remDup.length();
		//String fl=flString(remDup,h);
	    String finalStri=result(remDup.length());
	    System.out.println(Output(finalStri));
	}
	static String removeDup(String s1,String s2)
	{
		StringBuffer str1=new StringBuffer(s1);
		StringBuffer str2=new StringBuffer(s2);
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				int it=str1.indexOf(s1.charAt(i)+"");
				int it2=str2.indexOf(s2.charAt(j)+"");
				if((it2!=-1)&&(it!=-1)&&(str1.charAt(it)==(str2.charAt(it2))))
				{
					str1.deleteCharAt(it);
					str2.deleteCharAt(it2);
					break;
				}
			}
		}
		return str1.toString()+str2.toString();
	}
	static String result(int l)
	{
		String str="FLAMES";
		int num=0,t=0,f=0;
		while(check(str)==1)
		{
			if(str.charAt(num)!='#')
			{
				if(t==(l-1))
				{
					str=str.replace(str.charAt(num), '#');
					t=0;
				}
				if(num==str.length()-1)
				{
					num=0;
				}
				else
				{
					num=num+1;
				}
				t=t+1;
			}
			else
			{
				if(num==(str.length()-1))
				{
					num=0;
				}
				else
				{
					num=num+1;
				}
			}
		}
		return (str);
	}
	static int check(String s)
	{
		int ctr=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='#')
			{
				ctr=ctr+1;
			}
		}
		if(ctr!=1)
			return 1;
		else
			return 0;
	}
	static String Output(String s)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s.charAt(i)!='#')
			{
				if(c=='F')
				{
					res="Friend";
				}
				if(c=='A')
				{
					res="Affection";
				}
				if(c=='E')
				{
					res="Enemy";
				}
				if(c=='S')
				{
					res="Sisters";
				}
				if(c=='B')
				{
					res="Brothers";
				}
				if(c=='L')
				{
					res="Love";
				}
				if(c=='M')
				{
					res="Marriage";
				}
			}
		}
		return res;
	}
	}