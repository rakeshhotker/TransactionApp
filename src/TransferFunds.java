import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransferFunds {
    TransferFunds()
    {
        JFrame f=new JFrame();
        JLabel label1=new JLabel("Enter Payee Account Number");
        final JNumberTextField accountNumber=new JNumberTextField(10);
        JLabel label2=new JLabel("Enter Amount to be transferred");
        final JNumberTextField amount=new JNumberTextField(10);
        label1.setBounds(130,100,300,50);
        label2.setBounds(130,200,300,50);
        accountNumber.setBounds(350,100,150,50);
        amount.setBounds(350,200,150,50);
        JButton Transfer=new JButton("Transfer");
        Transfer.setBounds(130,400,150,50);
        Transfer.setFocusPainted(false);
        Transfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Transfer Successfull");
            }
        });
        f.add(label1);
        f.add(accountNumber);
        f.add(label2);
        f.add(amount);
        f.add(Transfer);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
