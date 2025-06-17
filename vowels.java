package First;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello how are you doing today?";
int vowels=0;
 
 {
	 for(int i=0;i<str.length();i++) {
		 char ch= Character.toLowerCase(str.charAt(i));
	
	 if(ch=='a' || ch=='e' || ch=='i' || ch=='0' ||ch=='u' )
		 vowels++;
	 }
 }

System.out.println(vowels);
	}

}
