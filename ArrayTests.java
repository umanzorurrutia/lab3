import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3,7,9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{9,7,3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {4,5,6};
    assertArrayEquals(new int[]{6,5,4}, ArrayExamples.reversed(input1));
  }
}
