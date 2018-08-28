import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc=new Scanner(System.in);
	      String s=sc.nextLine();
	      int count=0;
	      for(int i=0;i<s.length();i++)
	      {
	      	if(s.charAt(i)=='1'||s.charAt(i)=='0')
	      	count++;
	      }
	      if(count==s.length())
	            System.out.println("yes");
	       else
	    		System.out.print("no");

	}
}
