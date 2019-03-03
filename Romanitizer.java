package javatraining.homework;
import java.util.Scanner;
public class Romanitizer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,i=0,n=sc.nextInt(),arr[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        while(n!=1)
        {
            if((n>arr[c])&&(n<=arr[++c]))
            {
                //System.out.println("a"+arr[c]);
                int y=n/arr[--c];
                n=n%arr[c];
               // System.out.println("n"+n);
                switch(arr[c])
                {
                    case 1:
                        print("I",y);
                        break;
                    case 4:
                        print("IV",y);
                        break;
                    case 5:
                        print("V",y);
                        break;
                    case 9:
                        print("IX",y);
                        break;
                    case 10:
                        print("X",y);
                        break;
                    case 40:
                        print("XL",y);
                        break;
                    case 50:
                        print("L",y);
                        break;
                    case 90:
                        print("XC",y);
                        break;
                    case 100:
                        print("C",y);
                        break;
                    case 400:
                        print("CD",y);
                        break;
                    case 500:
                        print("D",y);
                        break;
                    case 900:
                        print("CM",y);
                        break;
                    case 1000:
                        print("M",y);
                        break;
                }
                if((arr[c]==1)||(n==0))
                break;
                c=0;
            }
        }
    }
    static void print(String m,int times)
    {
        int i;
        for(i=0;i<times;i++)
            System.out.print(m);   
    }
    static void ans(int n)
    {
        
            n=n-((n/100)*10);
    }
}

