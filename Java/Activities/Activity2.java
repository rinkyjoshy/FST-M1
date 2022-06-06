package Activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
		int[] num = { 10,77,10,54 ,-11, 10};
		System.out.println("The array has " + Arrays.toString(num));
		
		int temp_sum = 0;
		int final_sum = 30;
		
		System.out.println("The result is " + result (num , temp_sum , final_sum));
		
		

	}

	private static Boolean result(int[] num, int temp_sum, int final_sum) {
		
		int searchnum = 10;
		for(int number : num)
		{
			if (number == searchnum)
			{
				temp_sum += number;
			}
				
			if (temp_sum > final_sum )
			{
				break;
			}
		}
		
		return temp_sum == final_sum;
	}

}
