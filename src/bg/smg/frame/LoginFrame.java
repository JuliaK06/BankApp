package bg.smg.frame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrame extends JFrame  {

    private JButton loginBtn;
    private JButton fpBtn;
    private JButton signUpBtn;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JTextField usernameTxF;
    private JPasswordField passwordFieldPwdF;

    public LoginFrame(){
        this.setTitle("Login into Bank app");
        this.setSize(400, 240);
        this.setLayout(null);
        usernameLbl = new JLabel("Username:");
        usernameTxF = new JTextField();
        passwordLbl = new JLabel("Password:");
        passwordFieldPwdF = new JPasswordField();
        loginBtn = new JButton("Login");
        fpBtn = new JButton("Forgotten password");
        signUpBtn = new JButton("Sign Up");

        usernameLbl.setBounds(40,20,100,20);
        usernameTxF.setBounds(140,20,160,20);
        passwordLbl.setBounds(40,60,160,20);
        passwordFieldPwdF.setBounds(140, 60, 160, 20);
        loginBtn.setBounds(140,100,100,20);
        signUpBtn.setBounds(40,140,100,20);
        fpBtn.setBounds(180,140,180,20);

        this.add(usernameLbl);
        this.add(usernameTxF);
        this.add(passwordLbl);
        this.add(passwordFieldPwdF);
        this.add(loginBtn);
        this.add(fpBtn);
        this.add(signUpBtn);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
