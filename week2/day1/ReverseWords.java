package week2.day1;

public class ReverseWords {
public static void main(String[] args) {
	String word="Test leaf";
	String[] name = word.split(" ");
	
//int len=name[1].length();
	char[]chararray=name[1].toCharArray();
	
	//name[1].toCharArray().length
	for (int i = chararray.length-1; i>=0; i--) {
		System.out.println(chararray[i]);
	}
	
	
	
}
}
