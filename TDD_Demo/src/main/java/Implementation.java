
public class Implementation implements Adder,Subtractor, Multiply, Division {

	private long result;
	public long Add(long...ls) {
		result = 0;
		for(long temp : ls) {
			result += temp;
		}
		return result;
		
	}
	public long subtract(long... ls) {
		result = ls[0];
		for (int i = 1; i < ls.length; i++ ) {
			result -= ls[i];
		}
		return result;
	}
	
	public long Mul(long... ls) {
		result = ls[0];
		for (int i = 1; i < ls.length; i++ ) {
			result *= ls[i];
		}
		return result;
	}
	
	public long Div(long... ls) {
		result = ls[0];
		for (int i = 1; i < ls.length; i++ ) {
			result /= ls[i];
		}
		return result;
	}
	
}

