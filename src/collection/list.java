package collection;
import java.util.*;
public class list
{
   public void show()
   {
	List<Integer> cl = new ArrayList();
   synchronized (cl)
   {
	
    cl.add(2);
    try
    {
   	 cl.wait(1000);
   	 cl.add(3);
    }
    catch(Exception e)
    {
   	 System.out.println(e);
    }
    cl.notify();
    cl.add(5);
   }
    
    System.out.println(cl);
}
    public static void main(String[] args)
    {
    	list l = new list();
    	l.show();
    }
}
