package First;

public class NoOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=4567,count=0;
		if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
	}

}
