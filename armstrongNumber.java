package week1.day1;

public class armstrongNumber {
	
	public static void main(String[] args) {
		
		int input = 153;
		int rem;
		int sum=0;
		while(input>0)
			
		{
			
			rem = input % 10;
			sum = sum + (rem*rem*rem);
			input = input / 10 ;
			
			System.out.println(sum);
		}
	}

}
