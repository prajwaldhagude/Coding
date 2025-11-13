package PAttern_programs;

public class Numbers 
{
  public void Print_i(int n)
  {
	  for(int i=1;i<n;i++)
      {
          for(int j=i;j<n;j++)
          {
             System.out.print(" ");
              
          }
          for(int j=1;j<=i;j++)
          {
              System.out.print(i+" ");
          }
          System.out.println();
      }
  }
  public void Print_j(int n)
  {
	  for(int i=1;i<n;i++)
      {
          for(int j=n;j>i;j--)
          {
        	  System.out.print(j+" ");
          }
          System.out.println();
      }
          }
  
  public void Print_j_(int n)
  {
	  int num = 1;
	  for(int i=1;i<n;i++)
      {
          for(int j=1;j<i;j++)
          {
        	  System.out.print(num+" ");
        	  num++;
          }
          System.out.println();
      }
          }
  
  public void Print_even(int n)
  {
	  
	  for(int i=1;i<n;i++)
      {
          for(int j=1;j<=i;j++)
          {
        	  if((i-j) %2 ==0 )
        	  {
        	  System.out.print("1 ");
        	  }
        	  else
        	  {
        		  System.out.print("0 ");
        	  }
        	 
          }
          System.out.println();
      }
          }
  
  public void Print_num(int n)
  {
	  
	  for(int i=1;i<n;i++)
      {
          for(int j=1;j<=i;j++)
          {
        	  System.out.print(" ");
        	 
          }
          for(int j=i;j<n;j++)
          {
        	  System.out.print(j+" ");
        	 
          }
          System.out.println();
      }
          for(int i=n-1;i>=1;i--)
          {
              for(int j=1;j<=i;j++)
              {
            	  System.out.print(" ");
            	 
              }
              for(int j=i;j<n;j++)
              {
            	  System.out.print(j+" ");
            	 
              }
              System.out.println();
          }
          }
}
