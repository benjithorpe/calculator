package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CalculatorView {

    JButton btnSeven = new JButton("7");
    JButton btnEight = new JButton("8");
    JButton btnNine = new JButton("9");

    JButton btnFour = new JButton("4");
    JButton btnFive = new JButton("5");
    JButton btnSix = new JButton("6");

    JButton btnOne = new JButton("1");
    JButton btnTwo = new JButton("2");
    JButton btnThree = new JButton("3");
    
    JButton zeroBtn = new JButton("0");
    JButton periodBtn = new JButton(".");

    // arithmetic operator buttons
    JButton additionBtn = new JButton("+");
    JButton subtractionBtn = new JButton("--");
    JButton divisionBtn = new JButton("/");
    JButton multiplicationBtn = new JButton("X");

    JButton clearBtn = new JButton("C");
    JButton deleteBtn = new JButton("Del");
    JButton equalToBtn = new JButton("=");
    
    JButton offBtn = new JButton("OFF");
    JTextField outputField = new JTextField("Output");

    public CalculatorView(){
        JFrame frame = new JFrame("Basic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(270, 400);
        frame.setResizable(false);
        frame.setLayout(null);
        
        // setting dimensions of buttons
        btnSeven.setBounds(5, 50, 50, 30);
        btnEight.setBounds(60, 50, 50, 30);
        btnNine.setBounds(115, 50, 50, 30);
        
        btnFour.setBounds(5, 75, 50, 30);
        btnFive.setBounds(60, 75, 50, 30);
        btnSix.setBounds(115, 75, 50, 30);
        
        btnOne.setBounds(5, 100, 50, 30);
        btnTwo.setBounds(60, 100, 50, 30);
        btnThree.setBounds(115, 100, 50, 30);
        
        zeroBtn.setBounds(60, 125, 50, 30);
        periodBtn.setBounds(5, 125, 50, 30);
        equalToBtn.setBounds(115, 130, 50, 30);
        
        subtractionBtn.setBounds(170, 50, 50, 30);
        additionBtn.setBounds(170, 75, 50, 30);
        multiplicationBtn.setBounds(170, 100, 50, 30);
        divisionBtn.setBounds(170, 125, 50, 30);
        
        offBtn.setBounds(5, 150, 60, 30);
        
        outputField.setBounds(5, 10, 260, 40);
//        outputField.setBorder(null);  // removes the border
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
    
    static void setLooks(){
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
    }

}
