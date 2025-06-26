package App;
import java.util.Scanner;


import Operations.Calculator;

public class CalculatorApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char continueCalc = 'Y';
		
		System.out.println("==== Console Calculator (Enhanced with ENUM + VARARGS) =====");
		
		do {
			
			System.out.println("Enter Operators (+, -, *, /, %)");
			char operator = sc.next().charAt(0);
			
			System.out.println("How many Numbers do you want to input? (min 2): ");
			int count = sc.nextInt();
			
			if(count < 2) {
				System.out.println("❌ You need at least 2 numbers for this operation.");
                continue;
			}
			
			double[] numbers = new double[count];
			
			for(int i = 0; i < count; i++) {
				
				System.out.println("Enter number " + (i+1) + ": ");
				
				numbers[i] = sc.nextDouble();
			}
			
			double result = Calculator.performOperator(operator, numbers);
			
			System.out.println("✅ Result: " + result);

	        System.out.print("Do you want to perform another calculation? (Y/N): ");
	        
	        continueCalc = sc.next().charAt(0);            
		
		}while(continueCalc == 'Y' || continueCalc == 'y');
		
		System.out.println("👋 Thank you for using the calculator. Goodbye!");
		
		sc.close();
		
		
		
	}
}
