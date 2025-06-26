package Operations;

public class Addition implements IOperation{

	@Override
	public double calculate(double... numbers) {
		
		if(numbers.length < 2) {
			
			System.out.println("Addition operation need minimum 2 numbers");
			
		}
		
		double result = 0;
		
		for(double num : numbers) {
			
			result =result+num;
			
		}
		
		return result;
		
	}

	
	
}
