package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter Operator: ");
        String operator = scanner.next();

        int answer = calculate(firstNumber, operator, secondNumber);
        System.out.println("Answer: " + answer);
    }

    /**
     *
     * @param firstNumber the first number
     * @param operator arithmetic operator
     * @param secondNumber the second number
     * @return an int containing the answer
     */
    public static int calculate(int firstNumber, String operator, int secondNumber) {

        switch (operator) {
            case "+":
                return (firstNumber + secondNumber);
            case "-":
                return (firstNumber - secondNumber);
            case "/":
                return (firstNumber / secondNumber);
            case "x":
            case "*":
                return (firstNumber * secondNumber);
            default:
                return 0;
        } // end switch case

    }
}
