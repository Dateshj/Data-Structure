import java.util.*;
class Factorial{
	public int fact(){
Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		int fact=1;
		for (int i=1;i<=n;i++){
			fact=fact*i;
			return fact;
		}
				
		}
	}

public class FactRecursion{
	public static void main(String[] args) {
		Factorial f1 = new Factorial();
		f1.fact();
	}
}
