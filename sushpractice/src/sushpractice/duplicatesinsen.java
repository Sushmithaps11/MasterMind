package sushpractice;

public class duplicatesinsen {
public static void main(String[] args) {
	String s1="My name is Khan";
	String s2=" ";
	
	s1=s1.toLowerCase();
	
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		
		if(ch !=' ')
		{
			if(s2.lastIndexOf(ch)==-1)
			{
				s2=s2+ch;
			}
		}
		else
		{
			s2=s2+' ';
		}
	}
	String s3=s2.trim();
	System.out.println(s3);

}
}
