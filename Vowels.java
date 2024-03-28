import java.util.Scanner;
public class Vowels
{
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       int count=0;
       System.out.println("enter a String");
       String str=sc.nextLine().toLowerCase();
       
       for(int i=0;i<str.length();i++)
       {
           char ch=str.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               count++;
           }
       }
       if(count>0)
       {
           System.out.println("Total number of vowels :"+count);
       }
       else
       {
           System.out.println("the string not contain vowels");
       }
       sc.close();
}
}