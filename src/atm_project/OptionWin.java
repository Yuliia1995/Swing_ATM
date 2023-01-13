package atm_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OptionWin extends JFrame {
    private JButton withdrawMoneyButton;
    private JButton checkBalanceButton;
    private JButton quitButton;
    private JButton depositMoneyButton;
    private JPanel mainPanel;

    public OptionWin(Account account) {
        setTitle("ATM 1990");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(550, 550);
        setVisible(true);
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BalanceCheck myBalance = new BalanceCheck(account);

            }
        });

        withdrawMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WithdrawWin withdrawWin = new WithdrawWin(account);
            }
        });
        depositMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DepositWin depositWin = new DepositWin(account);
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OptionWin.super.dispose();
                JOptionPane.showMessageDialog(null,"Thank you for using ATM 1990!");
                System.exit(0);
            }
        });
    }
}
