import java.util.Scanner;
public class deleting {
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }

    private static void calculateBMI() throws Exception {
        System.out.print("Proszę napisać wagę w kg ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Proszę napisać wzrost w cm: ");
        float height = s.nextFloat();
        float bmi = (100*100*weight)/(height*height);

        System.out.println("Ma pan/pani BMI: "+bmi);
        printBMICategory(bmi);

    }

    private static void printBMICategory(float bmi) {
        if(bmi < 16.00) {
            System.out.println("Wygłodzenie");
        }else if (bmi < 16.99) {
            System.out.println("Wychudzenie");
        }else if (bmi < 18.49) {
            System.out.println("niedowaga");
        }
        else if (bmi < 22.99) {
            System.out.println("norma niski przedział");
        }
        else if (bmi < 24.99) {
            System.out.println("norma niski przedział");
        }
        else if (bmi < 27.49) {
            System.out.println("norma wysoki przedział");
        }
        else if (bmi < 29.99) {
            System.out.println("– nadwaga niski przedział");
        }
        else if (bmi < 34.99) {
            System.out.println("nadwaga wysoki przedział");
        }
        else if (bmi < 39.9) {
            System.out.println("otyłość I stopnia");
        }
        else if (bmi < 40) {
            System.out.println(" otyłość II stopnia\n");
        }else {
            System.out.println("otyłość III stopnia\n");
        }
    }
}
