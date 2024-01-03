package com.io;

import java.util.StringTokenizer;

public class Test
{
	public static void main(String args[])
	{
		String s = "This# is# a# cat#";
		StringTokenizer st = new StringTokenizer(s,"#");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}