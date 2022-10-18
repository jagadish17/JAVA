package week2.day1;

public class Palindrome {
public static void main(String[] args) {
	String name="malayalam";
		String rev="";
		
	
	char[]chararray=name.toCharArray();
	//System.out.println(chararray);
for (int  i=chararray.length-1; i>= 0; i--) {
	//System.out.println(chararray[i]);
rev=rev+chararray[i];
	
}

if(name.equals(rev)) {
	System.out.println("It is palindrome word");
}

else {System.out.println("it is not palindrome");
}	
}}

