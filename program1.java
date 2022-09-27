import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        String a = getInput("Enter a: ");
        String b = getInput("Enter b: ");
        String operator = getInput("Type of operation");

        double result = 0;

        try {
            switch (operator) {
                case "+":
                    result = addition(a, b);
                    break;
                case "-":
                    result = subtraction(a, b);
                    break;
                case "*":
                    result = multyplyng(a, b);
                    break;
                case "/":
                    result = division(a, b);
                    break;
                default:
                    System.out.println("There is NO such operation! Please choose between the 4!");
                    break;
            }
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    static double addition(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1 + d2;
    }

    static double subtraction(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1 - d2;
    }

    static double multyplyng(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1 * d2;
    }

    static double division(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1 / d2;
    }
}