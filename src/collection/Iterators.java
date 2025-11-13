package collection;
import java.util.*;
public class Iterators 
{
    public static void main(String[] args)
    {
    	List<String> gfg = new ArrayList();
    	gfg.add("Prajwal");
    	gfg.add("Adesh");
    	gfg.add("karan");
    	Iterator<String> name = gfg.iterator();
    	for(String s: gfg)
    	{
    		System.out.println(name.getClass());
    	}
    	System.out.println(name.hashCode());
    	System.out.println(name.hasNext());
    	System.out.println(name.next());
    	
    	
    	
    }
}
