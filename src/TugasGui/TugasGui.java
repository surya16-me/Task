package TugasGui;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TugasGui implements ActionListener {
    private static JLabel label;
    private static JTextField user;
    private static JLabel pass;
    private static JPasswordField passw;
    private static JButton button;
    private static JLabel sukses;
    private static JLabel demo;
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300,250);
        frame.add(panel);
        panel.setBackground(Color.blue);
        panel.setLayout(null);
        
        label = new JLabel("Username");
        label.setBounds(10,20,80,25);
        label.setForeground(Color.white);
        panel.add(label);
        
        user = new JTextField(20);
        user.setBounds(100,20,165,25);
        user.setBackground(Color.lightGray);
        panel.add(user);
        
        pass = new JLabel("Password");
        pass.setBounds(10, 50, 80, 25);
        pass.setForeground(Color.white);
        panel.add(pass);
        
        passw = new JPasswordField(10);
        passw.setBounds(100,50,165,25);
        passw.setBackground(Color.lightGray);
        panel.add(passw);
        
        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new TugasGui());
        button.setBackground(Color.CYAN);
        panel.add(button);
        
        sukses = new JLabel();
        sukses.setBounds(10,110,300,25);
        panel.add(sukses);
        
        demo = new JLabel("Demo [User=admin password=pass]");
        demo.setForeground(Color.yellow);
        demo.setBounds(10,130,300,25);
        panel.add(demo);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String users = user.getText();
        String password = passw.getText();
        if(users.equals("admin")&& password.equals("pass")){
            sukses.setText("Login Sukses");
        }
        else{
            sukses.setText("Login Gagal");
        }
    }
    
}
