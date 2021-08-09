import java.io.Console;


public class Calculator {
    public static void main(String[] args) {
        Console myConsole = System.console();
        
        System.out.println("Please input your first number");
        String firstInput = myConsole.readLine();
        Integer firstNumber =  Integer.parseInt(firstInput);

        System.out.println("Please input your second number");
        String secondInput = myConsole.readLine();
        Integer secondNumber =  Integer.parseInt(secondInput);

        Integer sum = firstNumber + secondNumber;
        Integer difference = firstNumber - secondNumber;
        Integer multiple = firstNumber * secondNumber;
        Integer division = firstNumber / secondNumber;
        Integer modulus = firstNumber % secondNumber;

        System.out.println("The sum of your numbers is " + sum);
        System.out.println("The difference of your numbers is " + difference);
        System.out.println("The multiple of your numbers is " + multiple);
        System.out.println("The division of your numbers is " + division);
        System.out.println("The modulus of your numbers is " + modulus);
    }
}