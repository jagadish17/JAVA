	package week1.day3;

public class PrimeNumber {
	public static void main(String[] args) {
		
	
int a;
int b;
for (a=1;a<=100;a++) {	
	
    for(b=2;b<a;b++) {	
		if(a%b==0) 
			break;}
		if (a==b) {
			System.out.println(b);
}
}
}}