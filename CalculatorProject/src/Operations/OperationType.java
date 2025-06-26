package Operations;
public enum OperationType{
	
	ADD('+'),
	SUBSTRACT('-'),
	MULTIPLY('*'),
	DIVIDE('/'),
	MODULUS('%');
	
	private final char symbol;
	
	OperationType(char symbol){
		
		this.symbol=symbol;
		
	}
	
	public char getSymbol() {
		
		return symbol;
		
	}
	
	public static OperationType fromChar(char ch) {
		
		for(OperationType type : values()) {
			
			if(type.symbol == ch) {
				
				return type;
				
			}
			
		}
		
		return null;// Invalid operator
	}
}
