package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import labs.Lab02;

class Tests_Lab02 {

public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
	
		String[] inputA = {"27", "12"};
		String[] inputB = {"14", "13"};
		int i = 0;
		try {
			for (; i < inputA.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputA[i] + " " + inputB[i]);
				Lab02.problem01();
				inOut.getOutputStream();
				int startingIndex = 0;
				for (int j = 0; j < inOut.getOutputStream().length(); j++) {
					if (Character.isDigit(inOut.getOutputStream().charAt(j))) {
						startingIndex = j;
						break;
					}
				}
				
				String[] nums = inOut.getOutputStream().substring(startingIndex).split(" ");
				
				int max = Math.max(Integer.valueOf(inputA[i]), Integer.valueOf(inputB[i]));
				int min = Math.min(Integer.valueOf(inputA[i]), Integer.valueOf(inputB[i]));
				
				for (int j = 0; j < 10; j++) {
					assertTrue(Integer.valueOf(nums[j]) >= min && Integer.valueOf(nums[j]) <= max);
				}
				
			}
			inOut.resetSystem();
			System.out.println("Test problem01(): Passed all inputs\n\n\n\n");
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			
			
			System.out.println("Error problem01(): "
					 + "\n   Input(s):  " + inputA[i] + " " + inputB[i]
					 + "\n   Either it did not print 10 numbers "
					 + "\n          or 1 or more numbers were out of range."
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			
			fail();

		}
		inOut.resetOutputStream();
		
	}
	
	
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
	
		String[] inputs = {"3 15", "12 9"};
		String[] expectedOutputs = {"424.1150082346", "4071.5040790523"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem02();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			inOut.resetSystem();
			System.out.println("Test problem02(): Passed all inputs\n\n\n\n");
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			System.out.println("Error problem02(): "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();

		}
		inOut.resetOutputStream();
		
	}

	
	
	

	
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
	
		String[] inputs = {"2 3 5 7", "4 5.3 12 -4"};
		String[] expectedOutputs = {"5.0", "12.267436570041"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem03();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			inOut.resetSystem();
			System.out.println("Test problem03(): Passed all inputs\n\n\n\n");
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			System.out.println("Error problem03(): "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();

		}
		inOut.resetOutputStream();
		
	}
	
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
	
		String[] inputA = {"2", "-1.4", "4"};
		String[] inputB = {"-14", "3.2", "9"};
		String[] inputC = {"24", "4.2", "3"};
		String[] expectedX1 = {"4.0", "-0.9322627209", "-0.406929669182"};
		String[] expectedX2 = {"3.0", "3.2179770066", "-1.843070330817"};
		int i = 0;
		
		try {
			for (; i < inputA.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputA[i] + " " + inputB[i] + " " + inputC[i]);
				Lab02.problem04();
				assertTrue(inOut.getOutputStream().contains(expectedX1[i]));
				assertTrue(inOut.getOutputStream().contains(expectedX1[i]));
			}
			inOut.resetSystem();
			System.out.println("Test problem04(): Passed all inputs\n\n\n\n");
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			System.out.println("Error problem04(): "
					 + "\n   Input(s):  a: " + inputA[i] 
					 + "\n              b: " + inputB[i]
					 + "\n              C: " + inputC[i]
					 + "\n   Expected output should contain: " + expectedX1[i] 
					 + "\n                              and: " + expectedX2[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();

		}
		inOut.resetOutputStream();
		
	}
	
	
}
