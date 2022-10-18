package week1.day2;

public class Calculator {
	public void additonNumbers(int a,int b) {
		int c;
		c= a+b;
		System.out.println(c);
	}
	public void subtractionNumbers(int e,int f) {
		int g;
		g= e-f;
		System.out.println(g);
		}
	public void multiplyNumbers(double i ,double j) {
		double k;
		k= i*j;
		System.out.println(k);
	}
	public void divisonNumbers(float x,float y) {
		float z;
		z= x/y;
		System.out.println(z);
	}
public static void main(String []args) {
	Calculator cal=new Calculator();
	System.out.print("Addition =");cal.additonNumbers(20,22);
	System.out.print("Subtraction =");cal.subtractionNumbers(45,44);
	System.out.print("Multiplication =");cal.multiplyNumbers(4.4,5.5);
	System.out.print("divison =");cal.divisonNumbers(564.5f,104.23f);


}
}
