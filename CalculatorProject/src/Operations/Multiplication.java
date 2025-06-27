package Operations;

public class Multiplication implements IOperation {

	@Override
	public double calculate(double... numbers) {
		
		if(numbers.length < 2) {
			
			System.out.println("Multiplication operation need minimum 2 numbers");
			
		}
		
		double result = 0;
		
		for(double num : numbers) {
			
			result *= num;
			
		}
		
		return result;
	}
	
}
