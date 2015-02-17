/**
 * Euler One adds multiples of 3 and 5.
 * Created by amytakayesu on 2/2/15.
 */
public class ProjectEulerOne {
  /**
   * Calls sumOfMultiples and sets upperBound.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    int sum = sumOfMultiples(1000);
    System.out.println("Sum is " + sum);
  }

  /**
   * Computes sum of multiples of 3 and 5 up to the upperBound.
   *
   * @param upperBound number to stop computing at
   * @return the sum of multiples
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
