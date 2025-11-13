package string_tuto;
import java.util.*;
public class string_methods 
{
   public void Show(String s,String p)
   {
	   int n = s.length();
	   String l = s.trim();
//	   if(l==0)
//	   {
//		   System.out.println("Invalid");
//	   }
//	   else
//	   {
//		   System.out.println("Valid");
//	   }
	   
	   //System.out.println(p.equalsIgnoreCase(l));
	   System.out.println(s.codePointBefore(2));
   }
}
