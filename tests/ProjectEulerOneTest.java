import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tester class for Euler One.
 * @author amy takayesu
 */
public class ProjectEulerOneTest {
  /**
   * Test for sum of multiples with 10 and 20 as upper bounds.
   * @throws Exception if doesn't compute.
   */
  @Test
  public void testSumOfMultiples() throws Exception {
    assertEquals("UpperBound 10", 23, ProjectEulerOne.sumOfMultiples(10));
    assertEquals("UpperBound 20", 78, ProjectEulerOne.sumOfMultiples(20));
  }
}