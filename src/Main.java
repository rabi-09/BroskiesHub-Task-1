import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
		
		//Traditional Method
		if(num%2==0)
			System.out.println(num+" is Even");
		else
			System.out.println(num+" is Odd");
		
		
		//Using Ternary Operator
        System.out.println(num+" is "+ (num%2==0 ? "Even" : "Odd"));
	}
}