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
	
	/**
	 * IMPLEMENTATION of the test methods for addition.
	 * 
	 *
	 * 
	 */

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
	
	

	@Test
	public void testAddZero() {
		// Testing the case 0 + 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

			// Testing the case of 0 + (something random)
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (1000)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case of (something random) + 0
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (1000)));
			secondNumber = 0;
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
	
	

	@Test
	public void testAddSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	/**
	 * IMPLEMENTATION of the test methods for subtraction.
	 * 
	 *
	 * 
	 */
	
	@Test
	public void testSubtractSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " (" + result +")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
	
	@Test
	public void testSubtractMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " (" + result +")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
	
	@Test
	public void testSubtractLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " (" + result +")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
	
	@Test
	public void testSubtractSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " (" + result +")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
	
	@Test
	public void testSubtractMediumSizedNegatieNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " (" + result +")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
	
	@Test
	public void testSubtractLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " (" + result +")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
	
	@Test
	public void testSubtractZero() {
		// Testing the case 0 + 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

			// Testing the case of 0 + (something random)
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (1000)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case of (something random) + 0
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (1000)));
			secondNumber = 0;
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}
	
	/**
	 * Test av division
	 */
	
	@Test
	public void testDivideSmallSizedPositiveNumbers() {
		// testing the case 0/0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;

		/*for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber; */

			LOG.info("Testing the method divide with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);
			
			// testing the case of (Random something) / 0
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(1000)));
			secondNumber = 0;
			result = -0.123456789;
			LOG.info("Testing the method divide with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}


/*
 * Small positive numbers: You will generate random numbers between 0-10 Medium
 * positive numbers: You will generate random numbers between 0-100 Large
 * positive numbers: You will generate random numbers between 0-1000 Zeros: you
 * will test zeros (here you will not use random!!) Small negative numbers: You
 * will generate random numbers between 0 and -10 Medium negative numbers: You
 * will generate random numbers between 0 and -100 Large negative numbers: You
 * will generate random numbers between 0 and -1000
 */