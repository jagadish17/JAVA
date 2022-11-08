package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveWords {
	public static void main(String[] args) {
		String line = "this word is important word is";
		String array[] = line.split(" ");
		
		Set<String> s = new LinkedHashSet<String>();// Insertion
		// Set<String> s = new HashSet<String>(); //Order
		// Set<String> s = new TreeSet<String>(); //Ascending

		for (int i = 0; i < array.length; i++) {

			s.add(array[i]);

		}
		System.out.println(s);
	}
}
