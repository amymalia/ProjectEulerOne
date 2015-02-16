/**
 * Project Euler One
 * Created by amytakayesu on 2/2/15.
 */
public class ProjectEulerOne {
  /**
   * Calls the sumOfMultiples method and prints out the return value as the sum.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    int sum = sumOfMultiples(1000);
    System.out.println("Sum is " + sum);
  }

  /**
   * Calculates the sum of all of the numbers from 0 - upperBound that
   * are a multiple of 3 or 5.
   *
   * @param upperBound number to stop finding multiples at
   * @return int sum of the multiples
   */
  public static int sumOfMultiples(int upperBound) {
    int sum = 0;
    for (int i = 0; i < upperBound; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }
    return sum;
  }
}
