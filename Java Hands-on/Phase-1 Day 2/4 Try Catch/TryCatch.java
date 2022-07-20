class TryCatch {
  public static void main(String[] args) {

    try {
      int divideByZero = 17 / 0;
      System.out.println("code is correct");
    }

    catch (ArithmeticException e) {
      System.out.println("error");
    }
  }
}