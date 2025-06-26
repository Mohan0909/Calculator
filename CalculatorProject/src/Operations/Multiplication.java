package Operations;

public class Multiplication implements IOperation {

	@Override
	public double calculate(double... numbers) {
		
		double result = 0;
		
		for(double num : numbers) {
			
			result *= num;
			
		}
		
		return result;
	}
	
}
