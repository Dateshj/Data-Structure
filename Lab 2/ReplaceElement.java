/*Read n numbers in an array then read two different numbers, 
replace 1st number with 2nd number in an array and print its index and final array.*/

import java.util.*;
public class ReplaceElement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		int num3;
		int count=0;
		for (int i =0;i<n;i++){
			if(a[i]==num2){
				a[i]=num1;
				count++;
				System.out.println("index of replaced number"+i);
			}
		}
		if (count==0) {
			System.out.println("No element has matches");
		}
		System.out.println("new array=");
		for (int i=0;i<n;i++){
		System.out.print(a[i]+",");
		}
		
	}
}