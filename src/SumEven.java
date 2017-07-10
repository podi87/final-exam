/**
 * Created by Asus on 2017-07-10.
 */
public class SumEven {

  public int sumEvenNumbers(int [] inputArray) {
    int sum = 0;
    int average = 0;
    int counter = 0;
    for(int i : inputArray) {
      if (i % 2 == 0) {
        sum = sum + i;
        counter++;
      }
    }
    if (counter > 1 && sum != 0) {
      return sum / counter;
    } else {
      return average;
    }
  }
}
