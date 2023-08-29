package com.LogicalProgram;

public class Pattern_N
{
	public static void main(String[] args)
	{
		int n=5; 
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==5 || i==j)
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
