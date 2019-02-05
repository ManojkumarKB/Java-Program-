import java.util.*;
class negsubarr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,sum=0,count=0,n=sc.nextInt(),arr[]=new int[n];
		for(i=0;i<n;i++)
		{	
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=0;
			sum=sum+arr[i];
			if(sum<0)
			{
				count=count+1;
			}
			for(j=i+1;j<n;j++)
			{
				sum=sum+arr[j];
				if(sum<0)
				{
					count=count+1;
				}
			}
		}
			System.out.println("The counting of negative subarray is"+count);
	}
}

			