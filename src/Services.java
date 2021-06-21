import javax.swing.*;

public class Services {
    Services()
    {
        JFrame f=new JFrame();
        JButton depositButton=new JButton("Deposit");
        JButton withdrawButton=new JButton("Withdraw");
        JButton TransferButton=new JButton("TransferFunds");
        depositButton.setBounds(130,100,200,50);
        withdrawButton.setBounds(260,100,200,50);
        TransferButton.setBounds(390,100,200,50);
        f.add(depositButton);
        f.add(withdrawButton);
        f.add(TransferButton);
        f.setVisible(true);
        f.setSize(600,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
