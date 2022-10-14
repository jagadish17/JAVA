package weekk1.day4;

public class InterSection {
public static void main(String[] args) {
	int[] numbers= {1,2,3,4,5,6};
	int[] numbers2= {1,2,3,8,9,0};
	for (int i = 0; i < numbers.length; i++) {
		for (int j = 0; j < numbers2.length; j++) {
			if(numbers[i]==numbers2[j]) {
				System.out.println("Intersection numbers :"+numbers[i]);
			}
			
		}
	}
		
	}
	
	
}
