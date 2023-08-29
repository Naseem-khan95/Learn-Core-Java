package com.LogicalProgram;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		int n=5 ;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j==1 || i==5  && j==5 || i==5 && j==1 || i==1 && j==5)
				{
					System.out.print(" #");
				}
				else if(i==1 || j==1 || i==5 || j==5 || i==5 || j==1 || i==1 || j==5)
				{
					System.out.print(" !");
				}
				else if(i==3 && j==3)
				{
					System.out.print(" N");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
