package assignment4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class AverageTest {

	Average avg;
	int[] empty;
	int[] full;
	int k;
	
	@BeforeEach
	void setup() {
		avg = new Average();
		empty = new int[] {};
		full = new int[] {1,2,3,4,5};
	}
	
	
	@Test
	@DisplayName("k < len and 0, empty array")
	void lessEmpty() {
		k = -1;
		assertEquals(0, avg.average(k, empty), "Success");
	}
	@Test
	@DisplayName("k = len, empty array")
	void eqEmpty() {
		k = 0;
		assertEquals(0, avg.average(k, empty), "Success");
	}
	@Test
	@DisplayName("k > len, empty array")
	void moreEmpty() {
		k = 1;
		assertEquals(0, avg.average(k, empty), "Success");
	}
	
	@Test
	@DisplayName("k < 0, full array")
	void negFull() {
		k = -1;
		assertEquals(0, avg.average(k, full), "Success");
	}
	@Test
	@DisplayName("k < len, full array")
	void lessFull() {
		k = 3;
		assertEquals(2, avg.average(k, full), "Success");
	}
	@Test
	@DisplayName("k = len, full array")
	void eqFull() {
		k = 5;
		assertEquals(3, avg.average(k, full), "Success");
	}
	@Test
	@DisplayName("k > len, full array")
	void moreFull() {
		k = 10;
		assertEquals(3, avg.average(k, full), "Success");
	}
}
