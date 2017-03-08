package com.amit.javacode;

public class ThreadExample implements Runnable 
{

	//private static int count = 0;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
		int count = 0;
		for (int i=0;i<100;i++ ) 
		{
			//System.out.println();
			System.out.println(Thread.currentThread().getName() +" count is "+ count++);
			/*if(count==30)
			{
				System.out.println(Thread.currentThread().getName() + " is acive");
				Thread.currentThread().
				//Thread.currentThread().sleep(1000);
			//	break;
			}*/
			
			//if (ThreadMain.class.)
		}
		/*System.out.println("count is "+ count++);
		super.run();*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
