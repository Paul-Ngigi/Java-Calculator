import java.io.Console;

public class Addition {
    public static void main(String[] args) {
        Console firstConsole = System.console();
        Console secondConsole = System.console();

        System.out.println("Please input your first number");
        String num1 = firstConsole.readLine();
        Integer firstNumber = Integer.parseInt(num1);

        System.out.println("Please input your second number");
        String num2 = secondConsole.readLine();
        Integer secondNumber = Integer.parseInt(num2);

        Integer sum = firstNumber + secondNumber;
        System.out.println("The sum of the numbers is " + sum);
    }
}