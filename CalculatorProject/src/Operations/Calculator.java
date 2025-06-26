package Operations;

public class Calculator {
	
	public static double performOperator(char opeartorChar, double...numbers) {
		
		OperationType type = OperationType.fromChar(opeartorChar);
		
		if(type == null) {
			
			System.out.println("Unsupported Operator");
			
			return Double.NaN;
		}
		
		IOperation operation ;
		
				
		switch(type) {
		
			case ADD -> operation = new Addition();
		
			case SUBSTRACT -> operation = new Substraction();
		
			case MULTIPLY -> operation = new Multiplication();
		
			case DIVIDE -> operation = new Division();
		
			case MODULUS -> operation = new Modulus();
		
		
			default -> {
				
				throw new IllegalArgumentException();
				
			}
		}
		
		return operation.calculate(numbers);
		
	}
}
