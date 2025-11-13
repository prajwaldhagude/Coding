package string_tuto;
import string_tuto.Reverse;
public class Palindrom 
{
   public String palindrom(String s)
   {
	   String l = "";
	   for(String p : s.split(" "))
	   {
		   
		   l = l+p;
	   }
	   
	   Reverse d = new Reverse();
	   String a = l.toLowerCase();
	   String f = d.reverse(a);
//	   if(l.equals(f))
//	   {
//		   return true;
//	   }
	   return f;
   }
}
