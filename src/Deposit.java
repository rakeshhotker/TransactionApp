import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit {
    Deposit()
    {
        JFrame f=new JFrame();
        JLabel label1=new JLabel("Enter Amount");
        final JNumberTextField DepositAmount=new JNumberTextField(10);
        label1.setBounds(130,100,200,50);
        DepositAmount.setBounds(300,100,150,50);
        JButton Deposit=new JButton("Deposit");
        Deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Deposited Successfully");
            }
        });
        Deposit.setBounds(130,240,150,50);
        f.add(label1);
        f.add(DepositAmount);
        f.add(Deposit);
        Deposit.setFocusPainted(false);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
