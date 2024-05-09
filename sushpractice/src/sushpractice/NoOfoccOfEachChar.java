package sushpractice;

import java.util.LinkedHashSet;

public class NoOfoccOfEachChar 
{
    public static void main(String[] args) 
    {
		String s="aaaabbbcc";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				
			}
		}
	}
}
