package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator {

    JTextField inputField   = new JTextField();
    final JButton btnSeven  = new JButton("7");
    final JButton btnEight  = new JButton("8");
    final JButton btnNine   = new JButton("9");
    final JButton clearBtn  = new JButton("Clear");

    final JButton btnFour   = new JButton("4");
    final JButton btnFive   = new JButton("5");
    final JButton btnSix    = new JButton("6");
    final JButton divideBtn = new JButton("/");

    final JButton btnOne        = new JButton("1");
    final JButton btnTwo        = new JButton("2");
    final JButton btnThree      = new JButton("3");
    final JButton multiplyBtn   = new JButton("x");

    final JButton btnZero       = new JButton("0");
    final JButton additionBtn   = new JButton("+");
    final JButton subtractBtn   = new JButton("--");
    final JButton equalToBtn    = new JButton("=");

    public Calculator() {
        final JFrame frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(300, 315);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        inputField.setEditable(false);

        // setting button colors
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setBackground(Color.RED);

        equalToBtn.setBackground(Color.BLUE);
        equalToBtn.setForeground(Color.WHITE);

        // dimension and sizes for components
        inputField.setBounds(5, 30,  290, 40);
        btnSeven.setBounds(5,   100, 70,  40);
        btnEight.setBounds(75,  100, 70,  40);
        btnNine.setBounds(146,  100, 70,  40);
        clearBtn.setBounds(215, 100, 80,  40);

        btnFour.setBounds(5,     145, 70, 40);
        btnFive.setBounds(75,    145, 70, 40);
        btnSix.setBounds(146,    145, 70, 40);
        divideBtn.setBounds(215, 145, 80, 40);

        btnOne.setBounds(5,        190, 70, 40);
        btnTwo.setBounds(75,       190, 70, 40);
        btnThree.setBounds(146,    190, 70, 40);
        multiplyBtn.setBounds(215, 190, 80, 40);

        btnZero.setBounds(5,       235, 70, 40);
        additionBtn.setBounds(75,  235, 70, 40);
        subtractBtn.setBounds(146, 235, 70, 40);
        equalToBtn.setBounds(215,  235, 80, 40);

        // adding components
        frame.add(inputField);
        frame.add(btnSeven);
        frame.add(btnEight);
        frame.add(btnNine);
        frame.add(clearBtn);

        frame.add(btnFour);
        frame.add(btnFive);
        frame.add(btnSix);
        frame.add(divideBtn);

        frame.add(btnOne);
        frame.add(btnTwo);
        frame.add(btnThree);
        frame.add(multiplyBtn);

        frame.add(btnZero);
        frame.add(additionBtn);
        frame.add(subtractBtn);
        frame.add(equalToBtn);

        frame.setVisible(true);
        buttonFunctions();
    }

    public static void main(String[] args) {
        setNimbusLookAndFeel();
        new Calculator();
    }

    public static void setNimbusLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) { /* do nothing */ }
    }

    private String firstNumber   = "0";
    private String secondNumber  = "0";
    private String operator      = "";
    private String currentNumber = "";

    private void buttonFunctions() {

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "9";
                inputField.setText(currentNumber);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "8";
                inputField.setText(currentNumber);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "7";
                inputField.setText(currentNumber);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "6";
                inputField.setText(currentNumber);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "5";
                inputField.setText(currentNumber);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "4";
                inputField.setText(currentNumber);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "3";
                inputField.setText(currentNumber);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "2";
                inputField.setText(currentNumber);
            }
        });

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "1";
                inputField.setText(currentNumber);
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentNumber += "0";
                inputField.setText(currentNumber);
            }
        });

        subtractBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operator = "-";
                getFirstNumber();
            }
        });

        additionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operator = "+";
                getFirstNumber();
            }
        });

        multiplyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operator = "x";
                getFirstNumber();
            }
        });

        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operator = "/";
                getFirstNumber();
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                inputField.setText("");
                currentNumber = "";
            }
        });

        equalToBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                secondNumber = inputField.getText();
                inputField.setText(calculate(firstNumber, operator, secondNumber));
                currentNumber = "";
            }
        });
    }

    private void getFirstNumber() {
        firstNumber = inputField.getText();
        inputField.setText(currentNumber = "");
    }

    /**
     * 
     * @param firstNumber
     * @param operator arithmetic operator
     * @param secondNumber
     * @return a string containing the answer
     */
    public String calculate(String firstNumber, String operator, String secondNumber) {
        try {
            int first = Integer.parseInt(firstNumber);
            int second = Integer.parseInt(secondNumber);

            switch (operator) {
                case "+": return (first + second) + "";
                case "-": return (first - second) + "";
                case "/": return (first / second) + "";
                case "x": return (first * second) + "";
            } // end switch case
        } catch (ArithmeticException | NumberFormatException e) { /* do nothing */ }

        return "0";
    }
}
