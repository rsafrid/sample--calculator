
/**
 * Main class. 
 **/

public class Main {
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		System.out.println(calculator.divide(0, 0));
		System.out.println(calculator.divide(7, 0));
	}

}
