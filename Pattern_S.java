package com.LogicalProgram;

public class Pattern_S 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1&&j<=4 || j==1&&i<4 || i==3&&j<=4 || i==4&&j==4 || i==5&&j<=4)
				{
					System.out.print(" S");
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
