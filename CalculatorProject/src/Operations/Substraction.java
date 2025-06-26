package Operations;

public class Substraction implements IOperation{

	@Override
	public double calculate(double... numbers) {
		
		if(numbers.length < 2) {
			
			System.out.println("Substract operation need minimum 2 numbers");
			
		}
		
		double result = 0;
		
		for(double num : numbers) {
			
			result -= num;
			
		}
		
		return result;
		
	}

}
