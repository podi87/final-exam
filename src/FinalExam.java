

public class FinalExam {

  private static int[] intArray = new int[] {1,2,3,4,5,6,7};
  private static int[] intArray2 = new int[] {2,3,-4,6};


  public static void main(String[] args) {

    SumEven sumEven = new SumEven();
    System.out.println(sumEven.sumEvenNumbers(intArray));
    System.out.println(sumEven.sumEvenNumbers(intArray2));
  }
}
