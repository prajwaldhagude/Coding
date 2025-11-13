package string_tuto;
import java.util.Arrays;
import java.util.*;


public class Vovels 
{
	 public String Remove(String s)
	   {
		 char[] arr = s.toCharArray();
		   int n= arr.length;
		   char[] unique = new char[n];
		   int k=0;
		   for(int i=0;i<n;i++)
		   {
			   Boolean found = false;
			   for(int j=0;j<k;j++)
			   {
				   if(arr[i]==arr[j])
				   {
					   found =true;
					   break;
				   }
			   }
			   if(!found)
			   {
				   unique[k] = arr[i];
				   k++;
			   }
		   }
		   char[] as = Arrays.copyOf(unique, k);
		   return new String(as);
	   }
  
	 public List<Character> vovels(String s)
	 {
		 Vovels v = new Vovels();
		 String p = v.Remove(s.toLowerCase());
		 int n = p.length();
		 List<Character> list = new ArrayList();
		 
		 for(int i=0;i<n;i++)
		 {
			 if(p.charAt(i)=='a' || p.charAt(i)=='e' || 
			p.charAt(i)=='i' ||p.charAt(i)=='o' || p.charAt(i)=='u')
			 {
				 list.add(p.charAt(i));
			 }
		 }
		 return list;
	 }
}
