package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,3,2,4,5,5};
	Arrays.sort(numbers);
	Set<Integer>Duplicate=new HashSet<Integer>();
	for(int i=0;i<numbers.length;i++){
		Duplicate.add(numbers[i]);
		
	}
	System.out.println(Duplicate);
	}

}
