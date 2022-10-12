package week1.day3;

public class FibonacciSeries {
public static void main(String[] args) {
	int a=0,b=1;
	int c;
	int i;
	int n=10;
	
	for ( i = 2; i<n; ++i) {
	    c=a+b;
		a=b;
		b=c;
		System.out.print(c+",");
		
		
		
	}
}
}
