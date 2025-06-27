package Operations;

public class Modulus implements IOperation {

	@Override
	public double calculate(double... numbers) {
		
		if(numbers.length<2) {
			
			System.out.println("Modulus operation need minimum 2 numbers");
			;
			
		}
		
		double result = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			
			try {
				
				if(numbers[i] == 0.0) {
					throw new ArithmeticException("Cannot perform modulus by zero at position " + (i + 1));
				} 
				
				result %= numbers[i];
				
			} catch(ArithmeticException ae) {
				
				System.out.println(ae.getMessage());
				
				return Double.NaN;
			}
		}
		
		return result;
		
	}

}
