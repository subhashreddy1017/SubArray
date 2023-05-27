package Recarsion;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int sum=0;
        int num1=checkPalindrome(num,sum);
        System.out.println(num1);
	}
	 static int checkPalindrome(int num,int sum) 
	{
		    if(num==0)
			return sum;
		     sum=sum*10+num%10;
		 
		return checkPalindrome(num/10,sum);
	}
}
