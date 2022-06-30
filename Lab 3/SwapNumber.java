/*Write a program to swap two numbers using user-defines method.*/

import java.util.*;
 class Swap{
 	int a,b,temp;
 	Scanner sc = new Scanner(System.in);
 	void swapping(){
 	System.out.println("enter a");
 	a= sc.nextInt();
 	System.out.println("enter b");
 	b=sc.nextInt();
 	System.out.println("before swapping : "+a+" "+b);
 	temp=a;
 	a=b;
 	temp=b;
 	System.out.println("after swapping : "+a+" "+b);
 	}
 }
 public class SwapNumber{
 	public static void main(String[] args) {
 		Swap s= new Swap();
 		s.swapping();
 	}
 }