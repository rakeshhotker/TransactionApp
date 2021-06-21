import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {

    Home()
    {
        JFrame f=new JFrame();
        JButton b=new JButton("Create Account");
        JButton c=new JButton("Login");
        b.setBounds(130,100,150,100);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateAccount();
                f.setVisible(false);
            }
        });
        c.setBounds(130,300,150,100);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                f.setVisible(false);
            }
        });
        f.add(b);
        f.add(c);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Home();
    }
}
