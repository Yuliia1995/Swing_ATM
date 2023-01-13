package atm_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceCheck  extends JFrame{
    private JLabel balanceLabel;
    private JLabel balanceSign;
    private JLabel balanceOutput;
    private JButton quit;
    private JPanel mainPanel;

    public BalanceCheck(Account account) {
        setTitle("ATM 1990");
        balanceOutput.setText(String.format("%,.2f",account.getBalance()));
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(550, 550);
        setVisible(true);
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BalanceCheck.super.dispose();
            }
        });
    }
}
