package com.problem.solving;

public class TestPattern 
{
	public static void main(String[] args) 
	{
		int counter=0;
		for(int i=1;i<=6;i++) 
		{
			for(int j=1; j<=6;j++) 
			{
				if(i%2!=0) 
				{	
					System.out.println();
					System.out.print(counter++);	
				}
				else 
				{
					System.out.println();
					System.out.print(counter++);
				}	
			}	
		}	
	}
}