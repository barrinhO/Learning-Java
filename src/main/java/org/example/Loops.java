public class Loops {
  public static void main(String[] args) {
    // lista de números
    int[] numbers = new int[5];
    numbers[0] = 0;
    numbers[1] = 1;
    numbers[2] = 2;
    numbers[3] = 3;
    numbers[4] = 4;

    System.out.println("Lista de números: \n");
    for (int number : numbers) {
      System.out.println(number);
    }

    System.out.println("\n");

    int someNumber = 0;

    while (someNumber < 10) {
      System.out.println(someNumber);
      someNumber++;
    }

  }
}
