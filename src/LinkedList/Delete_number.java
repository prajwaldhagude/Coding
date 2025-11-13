package LinkedList;
import java.util.*;
public class Delete_number 
{
   public void Delete(int[] arr,int num)
   {
	   int n = arr.length;
	   List<Integer> ap = new ArrayList();
	  for(int i=0;i<n;i++)
	  {
		 boolean found = false;
		 if(arr[i]==num)
		 {
			 found =true;
		 }
		 if(!found)
		 {
			 ap.add(arr[i]);
		 }
	  }
	  
		  System.out.print(ap);
	  
   }
}
