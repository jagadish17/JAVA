package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesset {


	public static void main(String[] args) {
		String name ="google";
		char[]value=name.toCharArray();
	Arrays.sort(value);
	Set<Character>Uniquevalues=new HashSet<Character>();
	for(int i=0;i<value.length;i++)
		Uniquevalues.add(value[i]);
	System.out.println(Uniquevalues);
		
	}
	
	
	}

	

