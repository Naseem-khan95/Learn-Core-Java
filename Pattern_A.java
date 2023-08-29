package com.LogicalProgram;

public class Pattern_A
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1 || j==5||i==3)
				{
					System.out.print(" A");
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
