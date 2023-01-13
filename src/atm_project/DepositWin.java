package atm_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositWin extends JFrame{
    private JLabel frameTitle;
    private JTextField inputField;
    private JRadioButton cashRadioButton;
    private JRadioButton checkRadioButton;
    private JLabel depositTypeLabel;
    private JLabel symbolDeposit;
    private JButton quitButton;
    private JButton OKButton;
    private JLabel callToActionLabel;
    private JPanel depositOptions;
    private JPanel mainPane;
    private JTextArea results;

    public DepositWin(Account account) {
        setTitle("ATM 1990");
        setContentPane(mainPane);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(550, 550);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cashRadioButton.isSelected() || checkRadioButton.isSelected()){
                    double depositAmt = Double.parseDouble(inputField.getText());
                    account.deposit(depositAmt);
                    inputField.setText("");
                    inputField.setEditable(false);
                    OKButton.setEnabled(false);
                    if (cashRadioButton.isSelected()) {
                        results.setText("Thank you for depositing cash in amount of \n$"+String.format("%,.2f",depositAmt)+".\nYour new balance is $"+String.format("%,.2f",account.getBalance()));
                    } else {
                        results.setText("Thank you for depositing checks in amount of \n$"+String.format("%,.2f",depositAmt)+".\nYour new balance is $"+String.format("%,.2f",account.getBalance()));
                    }
                } else {
                    results.setText("Please select the deposit type below, then click OK button.");
                }

            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DepositWin.super.dispose();
            }
        });
    }
}
