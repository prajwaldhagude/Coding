package com.Multithreading;
import java.lang.*;
public class FirstThread implements Runnable
{
	String name;
	Thread t;
	public FirstThread(String newthred)
	{
		name = newthred;
		t = new Thread(this,name);
		System.out.println("new Thread: "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=0;i<6;i++)
			{
				System.out.println(name+" :"+i);
			}
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		try 
		 { 
			 Thread.sleep(10000);
		 } 
		 catch (InterruptedException e) 
		 { 
		 System.out.println("Main thread Interrupted"); 
		 } 
	}
}


