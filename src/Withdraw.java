import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdraw {
    Withdraw()
    {
        JFrame f=new JFrame();
        JLabel label1=new JLabel("Enter Amount");
        final JNumberTextField WithdrawAmount=new JNumberTextField(10);
        label1.setBounds(130,100,200,50);
        WithdrawAmount.setBounds(300,100,150,50);
        JButton Withdraw=new JButton("Withdraw");
        Withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Withdrawn Successfully");
            }
        });
        Withdraw.setBounds(130,240,150,50);
        f.add(label1);
        f.add(WithdrawAmount);
        f.add(Withdraw);
        Withdraw.setFocusPainted(false);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
