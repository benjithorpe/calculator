package calculator;

public class Controls {

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
