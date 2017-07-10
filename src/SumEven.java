/**
 * Created by Asus on 2017-07-10.
 */
public class SumEven {

  public int sumEvenNumbers(int [] inputArray) {
    int sum = 0;
    int counter = 0;
    for(int i : inputArray) {
      if (i % 2 == 0) {
        sum = sum + i;
        counter++;
      }
    }
    return sum/counter;
  }
}
