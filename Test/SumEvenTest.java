import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Asus on 2017-07-10.
 */
public class SumEvenTest {

  private int[] testArray;
  private SumEven sumEven;

  @Before
  public void setUp() {
    sumEven = new SumEven();
    testArray = new int[] {1,2,3,4,5,6,7};
  }

  @org.junit.Test
  public void sumEvenNumbers() throws Exception {
    assertEquals(12, sumEven.sumEvenNumbers(testArray));
  }

}