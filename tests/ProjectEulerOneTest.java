import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler One Test.
 *
 */
public class ProjectEulerOneTest {

  /**
   * Tests the values of the sum of multiples method.
   * @throws Exception in case of failure
   */
  @Test
  public void testSumOfMultiples() throws Exception {
      assertEquals("Sum of multiples up to 10.", 23, ProjectEulerOne.sumOfMultiples(10));
      assertEquals("Sum of multiples up to 20.", 78, ProjectEulerOne.sumOfMultiples(20));
  }
}