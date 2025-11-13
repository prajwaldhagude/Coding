package Matrix;

public class Addition 
{
   public static void Show(int[][] arr)
   {
	   int n = arr[0].length;
	   
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   int count = 0;
			   int ap = arr[i][j];
			   if(ap==arr[i][j])
			   {
				   count++;
			   }
			   if(count>1)
			   {
				   System.out.println(ap);
			   }
		   }
		  
	   }
	   
   }
   public static void main(String[] aegs)
   {
	   int[][] arr = {{1,2,3},{4,5,6},{1,8,9}};
	   //System.out.println(Show(arr,10));
	   Show(arr);
   }
}
