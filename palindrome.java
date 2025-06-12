package First;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,num,rev=0,digit,rem;
		num=12345;
		while(i!=num)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
			
		}
		System.out.println(rev);
		
		if(num==rev)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
			}

		}



