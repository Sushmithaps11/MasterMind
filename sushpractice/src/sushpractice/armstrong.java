package sushpractice;

public class armstrong {
public static void main(String[] args) {
	int num=153;
	int arm=0;
	int orginalnum=num;
	
	while(num>0)
	{
		int rem=num%10;
		arm=rem*rem*rem+arm;
		num=num/10;
		
		
	}
	System.out.println(arm);
	
	if(orginalnum==arm)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("not");
	}
}
}
