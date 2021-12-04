package JpanelLab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JPanel{

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel panel1;
    private JTextField textField1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton buttonPlus;
    private JButton a5Button;
    private JButton a6Button;
    private JButton buttonMinus;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonMulti;
    private JButton buttonDiv;
    private JButton buttonDot;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton buttonEquals;
    private JButton clearButton;
    private JPanel Jpanel3;

    private void getOperator(String button_text) {
        math_operator = button_text.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public Calculator() {

        add(Jpanel3);
        Jpanel3.setPreferredSize(new Dimension(800, 800));
        //panel1.setPreferredSize(new Dimension(800,800));

        System.out.println("calculator() start");
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + a1Button.getText();
                textField1.setText(btnOneText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField1.getText() + a2Button.getText();
                textField1.setText(btnTwoText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField1.getText() + a3Button.getText();
                textField1.setText(btnThreeText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField1.getText() + a4Button.getText();
                textField1.setText(btnFourText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField1.getText() + a5Button.getText();
                textField1.setText(btnFiveText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField1.getText() + a6Button.getText();
                textField1.setText(btnSixText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField1.getText() + a7Button.getText();
                textField1.setText(btnSevenText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField1.getText() + a8Button.getText();
                textField1.setText(btnEightText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField1.getText() + a9Button.getText();
                textField1.setText(btnNineText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField1.getText() + a0Button.getText();
                textField1.setText(btnZeroText);
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonPlus.getText();
                getOperator(button_text);
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonMinus.getText();
                getOperator(button_text);
            }
        });
        buttonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonMulti.getText();
                getOperator(button_text);
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonDiv.getText();
                getOperator(button_text);
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDotText = textField1.getText() + buttonDot.getText();
                textField1.setText(btnDotText);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
            }
        });
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch ( math_operator ) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        break;

                    case '-':
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        break;

                    case '/':
                        total2 = total1 / Double.parseDouble(textField1.getText());
                        break;

                    case '*':
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                }

                textField1.setText( Double.toString(total2) );
                total1 = 0;
            }
        });

    }

}
