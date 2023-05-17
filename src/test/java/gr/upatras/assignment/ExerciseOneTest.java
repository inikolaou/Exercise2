package gr.upatras.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseOneTest {

	@Test
	void testSubtract() {
		assertEquals("POSITIVE", ExerciseOne.subtract(10, 5), "10 - 5 must be positive");
		assertEquals("NEGATIVE", ExerciseOne.subtract(5, 10), "5 - 10 must be negative");
	}

}
