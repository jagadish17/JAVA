package week2.day1;

public class upperodd {
	public static void main(String[] args) {
		String text = "abcdef";
	int len=text.length();
	char[]chararray=text.toCharArray();
	for(int i=0;i<=len;i++) {
	if(i%2!=1) {
	String odd="";
		odd=odd+chararray[i];
	
				System.out.println(odd.toUpperCase());
		//char[]chararray=text.toCharArray();
		//String Upper = text.toUpperCase();
		//System.out.println(Upper);
	}
	//	System.out.println(len);
		
	


	}
	}
}


