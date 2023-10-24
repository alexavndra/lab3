import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test
	public void testReverseInPlace() {
    int[] input1 = {3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3}, input1);
	}

  @Test // doesn't output correctly
  public void testReverseInPlace2() {
    int[] input1 = {3, 4, 5, 10, 2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2, 10, 5, 4, 3}, input1);
  }

  @Test
	public void testReverseInPlace3() {
    int[] input1 = {};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test // output is wrong
  public void testReversed2() {
    int[] input1 = {-100, -39, -4, 0, 1, 12, 20, 24, 30};
    assertArrayEquals(new int[]{30, 24, 20, 12, 1, 0, -4, -39, -100}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {-10.39, -10.39850, -7, -5, -1, 0, 5, 10};
    assertEquals(-1.19857142857, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
}
