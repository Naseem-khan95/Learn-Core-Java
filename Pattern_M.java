package com.LogicalProgram;

public class Pattern_M 
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==5 || i==1&&j==5 || i==2&&j==2 || i==3&&j==3 || j==4&&i==2)
				{
					System.out.print(" M");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
