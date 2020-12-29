package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CalculatorView {

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
    JTextField outputField = new JTextField("Output");

    public CalculatorView() {
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

    public static void main(String[] args) {
        setLooks();
        new CalculatorView();
    }

    static void setLooks() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
    }

}
