import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Services {

    Services()
    {
        JFrame f=new JFrame();
        JButton depositButton=new JButton("Deposit");
        JButton withdrawButton=new JButton("Withdraw");
        JButton TransferFunds=new JButton("TransferFunds");
        depositButton.setBounds(130,100,200,50);
        withdrawButton.setBounds(130,200,200,50);
        TransferFunds.setBounds(130,300,200,50);
        depositButton.setFocusPainted(false);
        withdrawButton.setFocusPainted(false);
        TransferFunds.setFocusPainted(false);
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Deposit();
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Withdraw();

            }
        });
        TransferFunds.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TransferFunds();
            }
        });
        f.add(depositButton);
        f.add(withdrawButton);
        f.add(TransferFunds);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
