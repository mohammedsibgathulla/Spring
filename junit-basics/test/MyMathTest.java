import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	@Test
	void sum_with3numbers() {	
		assertEquals(6, myMath.sum(new int[] {1,2,3}));		
	}
	@Test
	void sum_with1number() {	
		assertEquals(3, myMath.sum(new int[] {3}));		
	}

}
