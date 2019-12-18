import java.util.Scanner;
public class Update_horse {
		    static String str="";
		    static int x,y,n=0;
		    static char che[][]=new char[9][9];
		    static int i,ind[][]=new int[9][2];
			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the  x axis between 1 to 8");
			    x=sc.nextInt();
			    System.out.println("Enter the y axis between 1 to 8");
			    y=sc.nextInt();
			   n=n+xInc(x+1,y);
			   n=n+xDec(x-1,y);
			   n=n+(yInc(x,y+1));
			   n=n+(yDec(x,y-1));
			   String st[]=str.split("&");
			   
			   for(i=0;i<n;i++)
			   {
			      // System.out.println(st[i]);
			       String t[]=st[i].split(" ");
			       ind[i][0]=Integer.parseInt(t[0]);
			       ind[i][1]=Integer.parseInt(t[1]);
			       //System.out.println(ind[i][0]+" "+ind[i][1]+" i "+i);
			   }
			   ind[8][0]=x;
			   ind[8][1]=y;
			   
			   //printarr();
			   //sorting the ind array
			   for(int i=0;i<ind.length-1;i++)
				{
					for(int j=i+1;j<ind.length;j++)
					{
						if(ind[i][0]>ind[j][0])
						{
							swap(i,j);
						}
						if(ind[i][0]==ind[j][0])
						{
							if(ind[i][1]>=ind[j][1])
							{
								swap(i,j);
							}
						}
					}
				}
			   for(i=1;i<=8;i++)
			   {
				   for(int j=1;j<=8;j++)
				   {
					   int h=arrCheck(i,j);
					   if(h==1)
					   {
						   che[i][j]='*';
						//System.out.println(" i "+i+" h "+h);
					   }
				   }
			   }
			   che[x][y]='H';
			  // System.out.println(che[ind[8][0]][ind[8][1]]+" "+ind[8][0]+" "+ind[8][1]);
			   System.out.println(" 1 2 3 4 5 6 7 8");
				for(i=1;i<9;i++)
				{
						System.out.print(i);
					for(int j=1;j<9;j++)
					{
						if(che[i][j]!=' ')
						 System.out.print(che[i][j]+" ");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
				
			   System.out.println(n+" number of paths are available");
			}
			public static int xInc(int x,int y)
			{
			    int num=0;
			    if(((x+1)<=8)&&((y+1)<=8))
			    {
			        num=num+1;
			        //System.out.println("XInc->both inc->yes ");
			        //str=str+("("+(x+1)+","+(y+1)+")")+"|";
			        str=str+(x+1)+" "+(y+1)+"&";
			        //System.out.println(str);
			    }
			    if(((x+1)<=8)&&((y-1)>=1))
			    {
			        num=num+1;
			        //System.out.println("XInc->both inc and dec->yes ");
			       // str=str+("("+(x+1)+","+(y)+")")+"|";
			       str=str+(x+1)+" "+(y-1)+"&";
			      //  System.out.println(str);
			    }
			    return num;
			}
			public static int xDec(int x,int y)
			{
			    int num=0;
			    if(((x-1)>=1)&&((y-1)>=1))
			    {
			        num=num+1;
			        //System.out.println("XDec->both dec->yes ");
			      //  str=str+("("+(x-1)+","+(y-1)+")")+"|";
			        
			        str=str+(x-1)+" "+(y-1)+"&";
			       // System.out.println(str);
			        
			    }
			    if(((x-1)>=1)&&((y+1)<=8))
			    {
			        num=num+1;
			      //  System.out.println("XDec-> dec and Inc ->yes ");
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
			        num=num+1;
			       // System.out.println("YDec-> both dec ->yes ");
			        //str=str+("("+(x-1)+","+(y-1)+")")+"|";
			        str=str+(x-1)+" "+(y-1)+"&";
			        //System.out.println(str);
			    }
			    if(((x+1)<=8)&&((y-1)>=1))
			    {
			        num=num+1;
			       // System.out.println("YDec-> inc & dec ->yes ");
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
			        num=num+1;
			       // System.out.println("YInc-> both inc ->yes ");
			       // str=str+("("+(x+1)+","+(y+1)+")")+"|";
			        str=str+(x+1)+" "+(y+1)+"&";
			        //System.out.println(str);
			    }
			    if(((x-1)>=1)&&((y+1)<=8))
			    {
			        num=num+1;
			       // System.out.println("YInc-> dec and inc ->yes ");
			      //  str=str+("("+(x-1)+","+(y+1)+")")+"|";
			      str=str+(x-1)+" "+(y+1)+"&";
			       // System.out.println(str);
			    }
			    return num;
			}
			public static int arrCheck(int i,int j)
			{
				//System.out.println("Checking "+i+" is present in ind arr");
			    for(int it=0;it<9;it++)
			    {
			    	if(ind[it][0]==i)
			    	{
			    		if(ind[it][1]==j)
			    		{
			    			return 1;
			    		}
			    	}
			    }
			    return -1;
			}
			public static void printarr()
			{
				System.out.println("Printing the ind arry");
				for(int i=0;i<9;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(ind[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("End of array");
			}
			static void swap(int i,int j)
			{
					int t=ind[i][0];
					ind[i][0]=ind[j][0];
					ind[j][0]=t;
					t=ind[i][1];
					ind[i][1]=ind[j][1];
					ind[j][1]=t;
			}
}
