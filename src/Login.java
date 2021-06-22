import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    Login()
    {
        JFrame f=new JFrame();
        JLabel label1=new JLabel("Enter your Account Number");
        final JNumberTextField accountNumber=new JNumberTextField(10);
        JLabel label2=new JLabel("Enter your Password");
        final JPasswordField passwordField=new JPasswordField();
        label1.setBounds(130,100,200,50);
        accountNumber.setBounds(300,100,150,50);
        label2.setBounds(130,180,200,50);
        passwordField.setBounds(300,180,150,50);
        JButton loginbutton=new JButton("Login");
        loginbutton.setBounds(130,240,150,50);
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean status=false;
                if(accountNumber.getText()!=null && passwordField.getPassword()!=null) {
                    status = true;
                    if(status)
                    {
                        new Services();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Enter details");
                }
            }
        });
        f.add(label1);
        f.add(label2);
        f.add(accountNumber);
        f.add(passwordField);
        f.add(loginbutton);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
