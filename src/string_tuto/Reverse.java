package string_tuto;

public class Reverse 
{
   public String reverse(String s)
   {
	   int n = s.length();
	   char[] arr = s.toCharArray();
	   for(int i=0;i<n/2;i++)
	   {
		   char temp = arr[i];
		   arr[i] = arr[n-i-1];
		   arr[n-i-1] = temp;
	   }
	   return new String(arr);
   }
}
