package First;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4567;
		int sum =0;
		while(num>0)
		{
			int dig = num%10;
			sum = sum + dig;
			num = num/10;
		}

		System.out.println("Sum is: " + sum);
	}

}