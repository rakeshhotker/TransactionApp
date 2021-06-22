import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {

    Home()
    {
        JFrame f=new JFrame();
        JButton createAccount=new JButton("Create Account");
        JButton login=new JButton("Login");
        createAccount.setBounds(130,100,150,100);
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateAccount();
                f.setVisible(false);
            }
        });
        login.setBounds(130,300,150,100);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                f.setVisible(false);
            }
        });
        createAccount.setFocusPainted(false);
        login.setFocusPainted(false);
        f.add(createAccount);
        f.add(login);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Home();
    }
}
