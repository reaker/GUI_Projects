package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorApp extends JFrame {
    private JPanel Calculator;
    private JTextField text;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton aMinusButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton aMultiplyButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton aDividebutton;
    private JButton a0Button;
    private JButton aDotbutton;
    private JButton aEqualsButton;
    private JButton deleteButton;
    private JButton cButton;
    private JButton aPlusButton;
    private JRadioButton offRadioButton;
    private JRadioButton onRadioButton;
    private JLabel label;

    private double num;
    private int calculation;


    private calculatorApp() {

        a1Button.addActionListener(e -> text.setText(text.getText() + "1"));
        a2Button.addActionListener(e -> text.setText(text.getText() + "2"));
        a3Button.addActionListener(e -> text.setText(text.getText() + "3"));
        a4Button.addActionListener(e -> text.setText(text.getText() + "4"));
        a5Button.addActionListener(e -> text.setText(text.getText() + "5"));
        a6Button.addActionListener(e -> text.setText(text.getText() + "6"));
        a7Button.addActionListener(e -> text.setText(text.getText() + "7"));
        a8Button.addActionListener(e -> text.setText(text.getText() + "8"));
        a9Button.addActionListener(e -> text.setText(text.getText() + "9"));
        a0Button.addActionListener(e -> text.setText(text.getText() + "0"));

        aEqualsButton.addActionListener(e -> {
            arithmetic_op();
            label.setText("");
        });

        aPlusButton.addActionListener(e -> {
            num = Double.parseDouble(text.getText());
            calculation = 1;
            text.setText("");
            label.setText(num + "+");
        });
        aMinusButton.addActionListener(e -> {
            num = Double.parseDouble(text.getText());
            calculation = 2;
            text.setText("");
            label.setText(num + "-");
        });
        aMultiplyButton.addActionListener(e -> {
            num = Double.parseDouble(text.getText());
            calculation = 3;
            text.setText("");
            label.setText(num + "*");
        });
        aDividebutton.addActionListener(e -> {
            num = Double.parseDouble(text.getText());
            calculation = 4;
            text.setText("");
            label.setText(num + "/");
        });
        aDotbutton.addActionListener(e -> text.setText(text.getText() + "."));

        cButton.addActionListener(e -> text.setText(""));

        offRadioButton.addActionListener(e -> disableCalc());
        onRadioButton.addActionListener(e -> enableCalc());

        deleteButton.addActionListener(e -> {
            int length = text.getText().length();
            int number = text.getText().length() - 1;
            String store;

            if (length > 0) {
                StringBuilder back = new StringBuilder(text.getText());
                back.deleteCharAt(number);
                store = back.toString();
                text.setText(store);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculatorApp");
        frame.setContentPane(new calculatorApp().Calculator);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void arithmetic_op() {
        switch (calculation) {
            case 1:  // addition
                double ans = num + Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                break;
            case 2: //subtraction
                ans = num - Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                break;
            case 3: //multiplication
                ans = num * Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                break;
            case 4: //division
                ans = num / Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                break;
        }
    }

    private void disableCalc() {
        text.setEnabled(false);
        offRadioButton.setEnabled(false);
        onRadioButton.setEnabled(true);
        a0Button.setEnabled(false);
        a1Button.setEnabled(false);
        a2Button.setEnabled(false);
        a3Button.setEnabled(false);
        a4Button.setEnabled(false);
        a5Button.setEnabled(false);
        a6Button.setEnabled(false);
        a7Button.setEnabled(false);
        a8Button.setEnabled(false);
        a8Button.setEnabled(false);
        a9Button.setEnabled(false);
        deleteButton.setEnabled(false);
        aDotbutton.setEnabled(false);
        cButton.setEnabled(false);
        aDividebutton.setEnabled(false);
        aPlusButton.setEnabled(false);
        aMultiplyButton.setEnabled(false);
        aMinusButton.setEnabled(false);
        aEqualsButton.setEnabled(false);
    }

    private void enableCalc() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        aEqualsButton.setEnabled(true);
        text.setEnabled(true);
        a0Button.setEnabled(true);
        a1Button.setEnabled(true);
        a2Button.setEnabled(true);
        a3Button.setEnabled(true);
        a4Button.setEnabled(true);
        a5Button.setEnabled(true);
        a6Button.setEnabled(true);
        a7Button.setEnabled(true);
        a8Button.setEnabled(true);
        a8Button.setEnabled(true);
        a9Button.setEnabled(true);
        deleteButton.setEnabled(true);
        aDotbutton.setEnabled(true);
        cButton.setEnabled(true);
        aDividebutton.setEnabled(true);
        aPlusButton.setEnabled(true);
        aMultiplyButton.setEnabled(true);
        aMinusButton.setEnabled(true);
    }
}
