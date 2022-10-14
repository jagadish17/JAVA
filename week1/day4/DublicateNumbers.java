package week1.day4;

public class DublicateNumbers {
	public static void main(String[] args) {
		int[] array= {12,14,18,13,17,11,16,17,18};
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]+"is dublicate");
				}
				
			}
			
		}
	}
	
}
