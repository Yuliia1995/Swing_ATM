package atm_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawWin extends JFrame{
    private JPanel mainPanel;
    private JLabel withdrawTitle;
    private JLabel withdrawLabel;
    private JTextField inputField;
    private JLabel withdrawSign;
    private JTextArea resultBox;
    private JButton backButton;
    private JButton OKButton;
public WithdrawWin(Account account) {
    setTitle("ATM 1990");
    setContentPane(mainPanel);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(550, 550);
    setVisible(true);
    backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            WithdrawWin.super.dispose();
        }
    });
    OKButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!inputField.getText().equals("")) {
                double withdrawAmt = Double.parseDouble(inputField.getText());
                String msg = account.withdraw(withdrawAmt);
                resultBox.setText(msg+"\nYour current balance is $"+String.format("%,.2f", account.getBalance()));
                inputField.setEditable(false);
                inputField.setText("");
                OKButton.setEnabled(false);
            } else {
                resultBox.setText("Please enter the amount in the field above.\nThen click OK button to withdraw funds.\n" +
                        "To cancel the transaction click Back button");
            }
        }
    });
}
}
