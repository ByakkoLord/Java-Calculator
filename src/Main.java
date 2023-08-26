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

        String Key = scanner.nextLine();
        String LowerKey = Key.toLowerCase();
        System.out.println(LowerKey);

        System.out.println("Enter the second number");
        String valor1 = scanner.nextLine();

        double value0 =  Double.parseDouble(valor0);
        double value1 =  Double.parseDouble(valor1);

        switch (LowerKey){
            case "m":
                System.out.println("The result of the multiplication is:" + multi(value0, value1));
                break;
            case "d":
                System.out.println("The result of the division is:" + divs(value0, value1));
                break;
            case "a":
                System.out.println("The result of the addiction is:" + plus(value0, value1));
                break;
            case "s":
                System.out.println("The result of the subtraction is:" + subs(value0, value1));
                break;
        }

    }

    public static double multi(double x, double y){
        return x * y;
    }
    public static double divs(double x, double y){
        return x / y;
    }
    public static double plus(double x, double y){
        return x + y;
    }
    public static double subs(double x, double y){
        return x - y;
    }
}