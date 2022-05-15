package week1.day1;

public class fibonacciSeries {
	
	public static void main(String[] args) {
		
		int range = 8;
		int firstnumber = 0;
		int secondnumber = 1;
		System.out.println("fibonacci series of" + range + "numbers:");
		for(int i =1; i<=range; ++i)
		{
			System.out.println(firstnumber+" ");
			
			int sum = firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber = sum;
		}
	}     

}
