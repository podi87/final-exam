/**
 * Created by Asus on 2017-07-10.
 */
public class SumEven {

  public int sumEvenNumbers(int [] inputArray) {
    int sum = 0;
    int average = 0;
    int counter = 0;
    for(int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] % 2 == 0) {
        sum = sum + inputArray[i];
        counter++;
      }
    }
    return sum/counter;
  }
}
