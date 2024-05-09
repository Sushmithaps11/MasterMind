package sushpractice;

public class revsen {
public static void main(String[] args) {
	String s1="java is fun";
	String[]s2=s1.split(" ");
	String rev=" ";
	
	
	for(int i=0;i<s2.length;i++)
	{
		rev=s2[i]+" "+rev;
	}
	System.out.println(rev);
}
}
