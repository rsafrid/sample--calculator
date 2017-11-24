import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	
	
	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}

	@Test
	public void testAddMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}

	@Test
	public void testAddLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testAddZeroSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}


}

/*
Small positive numbers: You will generate random numbers between 0-10
Medium positive numbers: You will generate random numbers between 0-100
Large positive numbers: You will generate random numbers between 0-1000
Zeros: you will test zeros (here you will not use random!!)
Small negative numbers: You will generate random numbers between 0 and -10
Medium negative numbers: You will generate random numbers between 0 and -100
Large negative numbers: You will generate random numbers between 0 and -1000 */