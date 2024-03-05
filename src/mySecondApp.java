package pl.pp;
import java.util.Scanner;
public class mySecondApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 10;
        double y = 2;
        var result = x + y;
        System.out.println("x + y = " + result);
        result = x - y;
        System.out.println("x -y = " + result);
        result = x * y;
        System.out.println("x * y = " + result);
        result = x / y;
        System.out.println("x / y = " + result);
        result = x % y;
        System.out.println("x % y = " + result);
        System.out.println("Enter two numbers separated by the Enter key:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("x + y = " + (first + second));
      /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();
        scanner.close();
        System.out.println("Welcome " + forename + " " + surname);
         *\
    }
}