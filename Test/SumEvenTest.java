import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Asus on 2017-07-10.
 */
public class SumEvenTest {

  private int[] testArray;
  private int[] testArrayOdd;
  private int[] testArrayNegative;
  private SumEven sumEven;

  @Before
  public void setUp() {
    sumEven = new SumEven();
    testArray = new int[] {1,2,3,4,5,6,7};
    testArrayOdd = new int[] {1,5,7,9};
    testArrayNegative = new int[] {2,3,-4,6};
  }

  @Test
  public void sumEvenNumbersTest() throws Exception {
    assertEquals(4, sumEven.sumEvenNumbers(testArray));
  }

  @Test
  public void sumEvenNumbersTestWithOddNumbers() throws Exception {
    assertTrue(0 == sumEven.sumEvenNumbers(testArrayOdd));
  }

  @Test
  public void sumEvenNumbersTestWithNegativeNumber() throws Exception {
    assertEquals(1, sumEven.sumEvenNumbers(testArrayNegative));
  }

}