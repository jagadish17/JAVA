package week2.day1;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String word="testleaf";
		String remove="";
		int count=0;
		char[]chararray=word.toCharArray();
		for (int i = 0; i < chararray.length; i++)
			for (int j = 1; j < chararray.length; j++){
		if(chararray[i]==chararray[j]){
			count++;
			if(count==2) {
				System.out.println(chararray[j]);
				}
			}
			
		}
		
	}

}
