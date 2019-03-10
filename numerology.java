import java.util.Scanner;
class numerology
{
    static int ans=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String s=sc.next();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                upper(s.charAt(i));
            }
            else
            {
                lower(s.charAt(i));    
            }    
        }
      /*  String[] s1=ans.substring(0,ans.length()-1).split(".");
        System.out.println(ans.substring(0,ans.length()-1));
        for(i=0;i<s1.length;i++)
        {
            System.out.println("k"+s1[i]);
        }*/
        int sum=0,r=0,n=0;
        while(ans>0)
        {
            r=ans%10;
            sum=sum+r;
            ans=ans/10;
        }
        System.out.println("The numerology of "+s+" is "+sum);
    }
    public static void upper(char c)
    {
        int c1=(int)c-64;
        ans=ans+c1;
    }
    public static void lower(char c)
    {
        int c1=(int)c-96;
        ans=ans+c1;
    }
}