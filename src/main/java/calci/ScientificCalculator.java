package calci;

import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ScientificCalculator {

    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
    public static double sqrt(double num){
        return Math.sqrt(num);
    }

    public static int fact(int num){
        int n = 1;
        while(num>0) {
            n = n * num;
            num--;
        }
        return n;
    }

    public static double log(double num){
        return Math.log(num);
    }

    public static double pow(double num, double b){
        return Math.pow( num, b);
    }

    public static void main(String[] args) {

        logger.debug("hello from log4j2");
        logger.debug("Hi");
        logger.debug("Running Calculator");
        logger.debug("Choose");
        logger.debug("Bye");
        Scanner scanner = new Scanner(System.in);
        int c = 0;

        while(c != 5){
            System.out.println("\nWelcome to ScientificCalculator\nPlease Select the operation which you want to perform\n");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Natural Log");
            System.out.println("4) Power");
            System.out.println("5) Exit");
            c = scanner.nextInt();

            switch(c){
                case 1:
                    System.out.println("Enter the Number");
                    double root = scanner.nextDouble();
                    System.out.println("The Square Root of " + root + " : " + sqrt(root));
                    break;
                case 2:
                    System.out.println("Enter the Number");
                    int num = scanner.nextInt();
                    System.out.println("The Factorial of " + num + " : " + fact(num));
                    break;
                case 3:
                    System.out.println("Enter the Number");
                    double log = scanner.nextDouble();
                    System.out.println("The Natural Log of " + log + " : " + log(log));
                    break;
                case 4:
                    System.out.println("Enter the Base");
                    double b = scanner.nextDouble();
                    System.out.println("Enter the exponent");
                    double e = scanner.nextDouble();
                    System.out.println(b + "to the power of " + e + " : " + pow(b, e));
                    break;
                case 5:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
        scanner.close();
    }
}
