package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import labs.*;

class Tests_Lab01 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
	
		String[] inputs = {"3 5", "2 4", "8 4"};
		String[] expectedOutputs = {"243", "16", "4096"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem01();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			inOut.resetSystem();
			System.out.println("Test problem01(): Passed all inputs\n\n\n\n");
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			System.out.println("Error problem01(): "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();

		}
		inOut.resetOutputStream();
		
	}

	
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
	
		String[] inputs = {"30", "17", "12.4"};
		String[] expectedOutputs = {"5.477225575051", "4.123105625617", "3.521363372331"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem02();
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
	
		String[] inputs = {"5 7", "4.3 9", "3 4"};
		String[] expectedOutputs = {"8.602325267042", "9.974467404327", "5.0"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem03();
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
	
		String[] inputs = {"4 9 -3 0","5 7 -4 0", "-55 -5 -47 -1 -2 0", "3 17 9 12 0"};
		String[] expectedOutputMax = {"Max = 9", "Max = 7", "Max = 0", "Max = 17"};
		String[] expectedOutputMin = {"Min = -3", "Min = -4", "Min = -55", "Min = 0"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem04();
				assertTrue(inOut.getOutputStream().contains(expectedOutputMax[i]));
				assertTrue(inOut.getOutputStream().contains(expectedOutputMin[i]));
			}
			inOut.resetSystem();
			System.out.println("Test problem04(): Passed all inputs\n\n\n\n");
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			System.out.println("Error problem04(): "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputMax[i]
					 + "\n                                   " + expectedOutputMin[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();

		}
		inOut.resetOutputStream();
		
	}
	
	
}
