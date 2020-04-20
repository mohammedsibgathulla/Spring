import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	@BeforeEach
	public void beforeMethod() {
		System.out.println("From before method");
	}
	@AfterEach
	public void afterMethod() {
		System.out.println("From after method");
	}
	@BeforeAll
	public static void beforeClassMethod() {
		System.out.println("From before class method");
	}
	@AfterAll
	public static void afterClassMethod() {
		System.out.println("From after class method");
	}
	@Test
	void sum_with3numbers() {	
		System.out.println("Test 1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));		
	}
	@Test
	void sum_with1number() {	
		System.out.println("Test 2");
		assertEquals(3, myMath.sum(new int[] {3}));		
	}

}
