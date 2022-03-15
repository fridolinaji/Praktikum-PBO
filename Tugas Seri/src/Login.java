import java.awt.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Login extends JFrame{
    private JTextField f_User;
    private JPasswordField f_Pass;
    private JButton login, batal;
    
    public Login(){
        setSize(400, 250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        userInterface();
        setVisible(true);
    }
    
    private void userInterface(){
        JLabel judul = new JLabel("Form Login");
        judul.setHorizontalAlignment(JLabel.CENTER);
        judul.setFont(new Font("Arial", Font.PLAIN, 17));
        getContentPane().add(judul, "North");
        
        JPanel panComp = new JPanel();
        panComp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        JLabel user = new JLabel("Username");
        user.setPreferredSize(new Dimension(110, 25));
        user.setFont(new Font("Arial", Font.PLAIN, 14));
        panComp.add(user);
        
        f_User = new JTextField();
        f_User.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_User);
        
        JLabel pass = new JLabel("Password");
        pass.setPreferredSize(new Dimension(110, 25));
        pass.setFont(new Font("Arial", Font.PLAIN, 14));
        panComp.add(pass);
        
        f_Pass = new JPasswordField();
        f_Pass.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_Pass);
        
        getContentPane().add(panComp);
        
        JPanel panButton = new JPanel();
        panButton.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        login = new JButton("Login");
        panButton.add(login);
        
        batal = new JButton("Batal");
        panButton.add(batal);
        
        getContentPane().add(panButton, "South");
    }
    
    public static void main(String[] args){
        Login form = new Login();
    }
}
