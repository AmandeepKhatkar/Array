package array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[]= {94,2,6,45,0,3,-1};
		System.out.println("Enter elemnet to be searched:");
		int element=input.nextInt();
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				return i;
			}
			else
				return ;
			
				
		}
		
			System.out.println(" Element not found");
		

	}

}
