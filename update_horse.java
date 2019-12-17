import java.util.Scanner;
public class HorsePossiblePath {
    static String str="";
    static int x,y;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    x=sc.nextInt();
	    y=sc.nextInt();
	  
	   int n=0;
	   n=n+xInc(x+1,y);
	   n=n+xDec(x-1,y);
	   n=n+(yInc(x,y+1));
	   n=n+(yDec(x,y-1));
	   String st[]=str.split("&");
	   int ind[][]=new int[n][2];
	   for(int i=0;i<st.length;i++)
	   {
	      // System.out.println(st[i]);
	       String t[]=st[i].split(" ");
	       
	       ind[i][0]=Integer.parseInt(t[0]);
	       ind[i][1]=Integer.parseInt(t[1]);
	   }
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
	            if((arrCheck(i,j,ind)))
	            {
	               /* if((x==i)&&(y==(j-1)))
	           	    {
	           		    System.out.print("*");
	           	    }
	            	if((x==(i)&&(y==j)))
	           	    {
	           		    System.out.print("|");
	           	    }
	           	    else
	           	    {
	           		    System.out.print("| ");
	           	    }*/
	           	    System.out.println(i +" "+j+" "+ind);
	            }
	        }
	           System.out.println();
	           System.out.println("-----------------");
	     }
	   System.out.println(n+" number of paths are available");
	}
	public static int xInc(int x,int y)
	{
	    int num=0;
	    if(((x+1)<=8)&&((y+1)<=8))
	    {
	        num=1;
	        //str=str+("("+(x+1)+","+(y+1)+")")+"|";
	        str=str+(x+1)+" "+(y+1)+"&";
	        //System.out.println(str);
	    }
	    if(((x+1)<=8)&&((y-1)>=1))
	    {
	        num=num+1;
	       // str=str+("("+(x+1)+","+(y)+")")+"|";
	       str=str+(x+1)+" "+(y)+"&";
	        //System.out.println(str);
	    }
	    return num;
	}
	public static int xDec(int x,int y)
	{
	    int num=0;
	    if(((x-1)>=1)&&((y-1)>=1))
	    {
	        num=1;
	      //  str=str+("("+(x-1)+","+(y-1)+")")+"|";
	        str=str+(x-1)+" "+(y-1)+"&";
	       // System.out.println(str);
	        
	    }
	    if(((x-1)>=1)&&((y+1)>=8))
	    {
	        num=num+1;
	       // str=str+("("+(x-1)+","+(y+1)+")")+"|";
	       str=str+(x-1)+" "+(y+1)+"&";
	        //System.out.println(str);
	    }
	    return num;
	}
	public static int yDec(int x,int y)
	{
	    int num=0;
	    if(((x-1)>=1)&&((y-1)>=1))
	    {
	        num=1;
	        //str=str+("("+(x-1)+","+(y-1)+")")+"|";
	        str=str+(x-1)+" "+(y-1)+"&";
	        //System.out.println(str);
	    }
	    if(((x+1)>=8)&&((y-1)>=1))
	    {
	        num=num+1;
	        //str=str+("("+(x+1)+","+(y-1)+")")+"|";
	        str=str+(x+1)+" "+(y-1)+"&";
	        //System.out.println(str);
	    }
	    return num;
	}
	public static int yInc(int x,int y)
	{
	    int num=0;
	    if(((x+1)<=8)&&((y+1)<=8))
	    {
	        num=1;
	       // str=str+("("+(x+1)+","+(y+1)+")")+"|";
	        str=str+(x+1)+" "+(y+1)+"&";
	        //System.out.println(str);
	    }
	    if(((x-1)>=1)&&((y+1)>=8))
	    {
	        num=num+1;
	      //  str=str+("("+(x-1)+","+(y+1)+")")+"|";
	      str=str+(x-1)+" "+(y+1)+"&";
	       // System.out.println(str);
	    }
	    return num;
	}
	public static boolean arrCheck(int i,int j,int[][] arr)
	{
	    for(int it=0;it<arr.length;i++)
	    {
	        for(int jt=0;j<2;j++)
	        {
	            if((arr[it][jt]==i)&&(arr[it][jt]==j))
	            {
	                System.out.println(arr[it][jt]+" "+arr[it][jt]);
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
}