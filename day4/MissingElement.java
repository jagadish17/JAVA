package week1.day4;

import java.util.Arrays;

public class MissingElement {
	
		public static void main(String[] args)
		{
		int[] Num= {1,2,3,4,5,7,8,10};
		
		int Sum=Num.length;
		int misnum;
		
		Arrays.sort(Num);
		for(int i=0;i<Sum;i++)
		{
			misnum=i+1;
			if(misnum!=Num[i]) 
			{
				System.out.println(misnum);
				break;
}}}}