import java.util.*;
class diagdiff
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n=sc.nextInt(),arr[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The two diagonal difference is "+diagonaldiff(arr));
	}
	static int diagonaldiff(int arr[][])
	{
		int c=0,i,j,prim=0,sec=0;
      		for(i=0;i<arr.length;i++)
       		{
        		 for(j=(arr.length-1)-(c++);j<arr.length;j=arr.length)
         		{
          			prim=prim+arr[i][j];
         		}
       		}
       		c=0;
       		for(i=0;i<arr.length;i++)
       		{
        		 for(j=(c++);j<arr.length;j=arr.length)
         		{
            		 sec=sec+arr[i][j];
         		}
       		}
       		return Math.abs(prim-sec);
	}
}
