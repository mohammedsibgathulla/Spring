import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AssertTest {
	@Test
	void test() {
		assertEquals(1, 1);
		assertEquals(true, true);
		assertTrue(1>0);
		assertFalse(0>1);
		assertNotNull(1);
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}

}
