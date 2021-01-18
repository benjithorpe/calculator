package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator {

    final JButton btnSeven = new JButton("7");
    final JButton btnEight = new JButton("8");
    final JButton btnNine = new JButton("9");

    final JButton btnFour = new JButton("4");
    final JButton btnFive = new JButton("5");
    final JButton btnSix = new JButton("6");

    final JButton btnOne = new JButton("1");
    final JButton btnTwo = new JButton("2");
    final JButton btnThree = new JButton("3");

    final JButton zeroBtn = new JButton("0");
    final JButton periodBtn = new JButton(".");

    // arithmetic operator buttons
    final JButton additionBtn = new JButton("+");
    final JButton subtractionBtn = new JButton("--");
    final JButton divisionBtn = new JButton("/");
    final JButton multiplicationBtn = new JButton("X");

    final JButton clearBtn = new JButton("C");
    final JButton deleteBtn = new JButton("Del");
    final JButton equalToBtn = new JButton("=");

    final JButton offBtn = new JButton("OFF");
    JTextField outputField = new JTextField();

    public void design() {
        JFrame frame = new JFrame("Basic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(225, 270);
        frame.setResizable(false);
        frame.setLayout(null);

        // setting dimensions of buttons
        btnSeven.setBounds(5, 80, 50, 30);
        btnEight.setBounds(60, 80, 50, 30);
        btnNine.setBounds(115, 80, 50, 30);
        divisionBtn.setBounds(170, 80, 50, 30);

        btnFour.setBounds(5, 110, 50, 30);
        btnFive.setBounds(60, 110, 50, 30);
        btnSix.setBounds(115, 110, 50, 30);
        multiplicationBtn.setBounds(170, 110, 50, 30);

        btnOne.setBounds(5, 140, 50, 30);
        btnTwo.setBounds(60, 140, 50, 30);
        btnThree.setBounds(115, 140, 50, 30);
        subtractionBtn.setBounds(170, 140, 50, 30);

        periodBtn.setBounds(5, 170, 50, 30);
        zeroBtn.setBounds(60, 170, 50, 30);
        equalToBtn.setBounds(115, 170, 50, 30);
        additionBtn.setBounds(170, 170, 50, 30);

        offBtn.setBounds(5, 50, 52, 30);  // exits the calculator
        clearBtn.setBounds(115, 50, 50, 30);
        deleteBtn.setBounds(170, 50, 50, 30);

        outputField.setBounds(5, 5, 215, 40);
        outputField.setHorizontalAlignment(JTextField.RIGHT);  // sets text to right
        outputField.setBorder(null);  // removes the border
        outputField.setEditable(false);  // block any edits

        // adding the buttons
        frame.getContentPane().add(zeroBtn);
        frame.getContentPane().add(btnOne);
        frame.getContentPane().add(btnTwo);
        frame.getContentPane().add(btnThree);
        frame.getContentPane().add(btnFour);
        frame.getContentPane().add(btnFive);
        frame.getContentPane().add(btnSix);
        frame.getContentPane().add(btnSeven);
        frame.getContentPane().add(btnEight);
        frame.getContentPane().add(btnNine);
        frame.getContentPane().add(additionBtn);
        frame.getContentPane().add(subtractionBtn);
        frame.getContentPane().add(multiplicationBtn);
        frame.getContentPane().add(divisionBtn);
        frame.getContentPane().add(clearBtn);
        frame.getContentPane().add(deleteBtn);
        frame.getContentPane().add(periodBtn);
        frame.getContentPane().add(outputField);
        frame.getContentPane().add(equalToBtn);
        frame.getContentPane().add(offBtn);

        frame.setVisible(true);
    }

    StringBuilder currentNumber = new StringBuilder();
    boolean isOperatorPresent = false;

    void deleteOneValue() {
        StringBuilder currentValue = new StringBuilder(outputField.getText() + "");
        StringBuilder removed = new StringBuilder(currentValue);

        // check if there is value in the text field before deleting it
        if (removed.length() != 0) {
            StringBuilder returnValue = removed.delete(currentValue.length() - 1, currentValue.length());
            outputField.setText((currentNumber = returnValue) + "");
        }
    }

    private void functions() {
        offBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                outputField.setText("");
                currentNumber.delete(0, currentNumber.length());
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                deleteOneValue();
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("9");
                outputField.setText(currentNumber + "");
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("8");
                outputField.setText(currentNumber + "");
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("7");
                outputField.setText(currentNumber + "");
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("6");
                outputField.setText(currentNumber + "");
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("5");
                outputField.setText(currentNumber + "");
            }
        });

        btnFour.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("4");
                outputField.setText(currentNumber + "");
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("3");
                outputField.setText(currentNumber + "");
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("2");
                outputField.setText(currentNumber + "");
            }
        });

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("1");
                outputField.setText(currentNumber + "");
            }
        });

        zeroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append("0");
                outputField.setText(currentNumber + "");
            }
        });

        periodBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber.append(".");
                outputField.setText(currentNumber + "");
            }
        });

        additionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                outputField.setText(currentNumber.append(" + ") + "");
            }
        });

        subtractionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                outputField.setText(currentNumber.append(" -- ") + "");
            }
        });

        divisionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                outputField.setText(currentNumber.append(" / ") + "");
            }
        });

        multiplicationBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                outputField.setText(currentNumber.append(" X ") + "");
            }
        });

        equalToBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String[] expression = outputField.getText().split(" ");
                if (expression.length == 3) {
                    String first = expression[0].trim();
                    String operator = expression[1].trim();
                    String second = expression[2].trim();
                    String answer = "";

                    try {
                        if (first.contains(".") || second.contains(".")) {
                            double firstNum = Double.parseDouble(first);
                            double secondNum = Double.parseDouble(second);

                            answer = calculate(firstNum, operator, secondNum);
                            outputField.setText(answer);
                        } else {
                            int firstNum = Integer.parseInt(first);
                            int secondNum = Integer.parseInt(second);

                            answer = calculate(firstNum, operator, secondNum);
                            outputField.setText(answer);
                        }

                    } catch (NumberFormatException nfe) {
                    }
                    currentNumber.replace(0, currentNumber.length(), answer);
                }
            }
        });
    }

    public static String calculate(double firstNumber, String operator, double secondNumber) {
        // checks for invalid division value
        if (secondNumber == 0.0) {
            return "0.0";
        }

        switch (operator) {
            case "+":
                return (firstNumber + secondNumber) + "";
            case "--":
                return (firstNumber - secondNumber) + "";
            case "/":
                return (firstNumber / secondNumber) + "";
            case "X":
                return (firstNumber * secondNumber) + "";
            default:
                return "0.0";
        } // end switch case
    }

    public static String calculate(int firstNumber, String operator, int secondNumber) {
        // checks for invalid division value
        if (secondNumber == 0) {
            return "0";
        }

        switch (operator) {
            case "+":
                return (firstNumber + secondNumber) + "";
            case "--":
                return (firstNumber - secondNumber) + "";
            case "/":
                return (firstNumber / secondNumber) + "";
            case "X":
                return (firstNumber * secondNumber) + "";
            default:
                return "0";
        } // end switch case
    }

    public static void main(String[] args) {
        setLooks();
        Calculator calculator = new Calculator();
        calculator.design();
        calculator.functions();
    }

    static void setLooks() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
    }
}
