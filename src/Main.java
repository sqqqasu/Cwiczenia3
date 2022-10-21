import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        /* float ; */
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = reader.nextFloat();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter the second number");

        secondNumber = reader2.nextFloat();
        Float Sum = firstNumber + secondNumber;
        Float Difference = firstNumber - secondNumber;
        Float Product = firstNumber * secondNumber;
        Float Quotient = firstNumber / secondNumber;
        System.out.printf("Sum: %.2f\n", Sum);
        System.out.printf("Difference: %.2f\n", Difference);
        System.out.printf("Product: %.2f\n", Product);
        System.out.printf("Quotient: %.2f\n",Quotient);





    }
}