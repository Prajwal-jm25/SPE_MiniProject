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

        logger.debug("Starting the program");
        Scanner scanner = new Scanner(System.in);
        int c = 0;

        while(c != 5){
            logger.debug("User Input");
            System.out.println("\nWelcome to ScientificCalculator\nPlease Select the operation which you want to perform\n");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Natural Log");
            System.out.println("4) Power");
            System.out.println("5) Exit");
            c = scanner.nextInt();
            
            switch(c){
                case 1:
                    logger.debug("Input for Square Root Choice ");
                    System.out.println("Enter the Number");
                    double root = scanner.nextDouble();
                    logger.debug("Executing square root function");
                    System.out.println("The Square Root of " + root + " : " + sqrt(root));
                    break;
                case 2:
                    logger.debug("Input for Factorial of a Number");
                    System.out.println("Enter the Number");
                    int num = scanner.nextInt();
                    logger.debug("Executing factorial function");
                    System.out.println("The Factorial of " + num + " : " + fact(num));
                    break;
                case 3:
                    logger.debug("Input for Natural Log of a Number");
                    System.out.println("Enter the Number");
                    double log = scanner.nextDouble();
                    logger.debug("Executing Natual Log function");
                    System.out.println("The Natural Log of " + log + " : " + log(log));
                    break;
                case 4:
                    logger.debug("Input for Power function");
                    System.out.println("Enter the Base");
                    double b = scanner.nextDouble();
                    System.out.println("Enter the exponent");
                    double e = scanner.nextDouble();
                    logger.debug("Executing power function");
                    System.out.println(b + "to the power of " + e + " : " + pow(b, e));
                    break;
                case 5:
                    logger.debug("Exit");
                    System.out.println("GoodBye!");
                    break;
                default:
                    logger.debug("Invalid Choice");
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
        scanner.close();
    }
}
