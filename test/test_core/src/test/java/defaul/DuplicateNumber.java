package defaul;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1,2,3,4,5,-6,7,8,-9,8,6,-5 };
		Arrays.sort(numbers);
	
		
		for (int i : numbers) {
			System.out.println(i);
			
		}
	
		for(int i = 1; i < numbers.length; i++) {
		if(numbers[i] == numbers[i - 1]) {
		System.out.println("Duplicate: " + numbers[i]);
		}
		}
	}
	}


