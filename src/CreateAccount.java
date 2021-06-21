import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccount {
    CreateAccount()
    {
        JFrame f=new JFrame();
        JLabel label1=new JLabel("Enter your Aadhar Number");
        JNumberTextField aadharNumberInput=new JNumberTextField(12);
        label1.setBounds(130,100,150,50);
        aadharNumberInput.setBounds(300,100,150,50);
        JButton createAccount=new JButton("Create");
        createAccount.setBounds(200,200,300,50);
        JButton afterLogin=new JButton("Login");
        afterLogin.setBounds(200,300,300,50);
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean status=true;
                if(status)
                {
                    createAccount.setText("Created Successfully!");
                    f.add(afterLogin);
                }
            }
        });
        afterLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Login();
            }
        });
        f.add(createAccount);
        f.add(aadharNumberInput);
        f.add(label1);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
