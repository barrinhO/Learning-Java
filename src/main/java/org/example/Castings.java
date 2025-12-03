
// Castings

// Castings em Java convertem um valor de um tipo para outro quando essa
// conversão é possível, podendo ocorrer perda de informação.

// ex double, para int como no exemplo abaixo

public class Castings {
  public static void main(String[] args) {

    double result = 0.0;
    System.out.println("Double: " + result);

    int castingResult = (int) result;
    // casting
    System.out.println("Casting do double para int: " + castingResult + "\n");

    float result2 = 222222.2f;
    System.out.println("Float: " + result2);

    int castingResult2 = (int) result2;
    // casting
    System.out.println("Casting do float para int: " + castingResult2 + "\n");

    // Casting com String

    String numberString = "10";
    System.out.println(numberString + " em string");

    int castingNumberStringToInt = Integer.parseInt(numberString);
    System.out.println("CASTING: " + castingNumberStringToInt + " em inteiro" + "\n");

    // Reconversão

    int numberInt = 10;
    System.out.println(numberInt + " em inteiro");

    String castingNumberIntToString = String.valueOf(numberInt);
    System.out.println("CASTING: " + castingNumberIntToString + " em string" + "\n");
  }
}
