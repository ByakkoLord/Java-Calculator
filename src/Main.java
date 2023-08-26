import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Java Calculator");
        System.out.println("Enter the first number");
        String valor0 = scanner.nextLine();
        System.out.println("What operation you want to do?");
        System.out.println("Multiplication - Enter the Key 'M'");
        System.out.println("Division - Enter the Key 'D'");
        System.out.println("Addiction - Enter the Key 'A'");
        System.out.println("Subtraction - Enter the Key 'S'");
        String operation = scanner.nextLine();
        System.out.println("Enter the second number");
        String valor1 = scanner.nextLine();


    }
}