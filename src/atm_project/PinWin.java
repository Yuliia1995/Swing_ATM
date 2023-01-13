package atm_project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

public class PinWin extends JFrame{
    private JTextField welcomeToATM1990TextField;
    private JPasswordField passwordField1;
    private JFormattedTextField enterYourPINBelowFormattedTextField;
    private JFormattedTextField youGet3AttemptsFormattedTextField;
    private JButton enterButton;
    private JButton quitButton;
    private JPanel btnContainer;
    private JPanel mainPane;
    public int pinCounter = 0;

    public PinWin(Account account)  {
        setTitle("ATM 1990");
        setContentPane(mainPane);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(550, 550);
        setVisible(true);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                youGet3AttemptsFormattedTextField.setText("Bye!");
                PinWin.super.dispose();
//            setVisible(false);
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pinCounter<3){
                    if (passwordField1.getText().equals("")) {
                        pinCounter++;
                        youGet3AttemptsFormattedTextField.setText("Incorrect pin. You have "+(3-pinCounter)+" attempts left");
                    } else{
                        createOptionWin(account);
                        PinWin.super.dispose();
                    }
                } else {
                    PinWin.super.dispose();
                }
            }

            private OptionWin createOptionWin(Account account) {
                OptionWin optionWin = new OptionWin(account);
                return optionWin;
            }
        });


    }



}
