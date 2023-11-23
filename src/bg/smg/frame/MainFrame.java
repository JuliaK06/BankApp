package bg.smg.frame;

import bg.smg.model.Account;
import bg.smg.model.User;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame implements ItemListener, ActionListener {
 private User currentUser;
private JLabel bannerLbl;
 private Icon bannerIcn;
static JFrame mainFr;
static JComboBox menuAccounts;
    public MainFrame( User currentUser){
        mainFr = new JFrame();

        this.currentUser=currentUser;
        mainFr.setSize(600,500);
        mainFr.setTitle("Bank app");
mainFr.setLayout(new FlowLayout());


        Image image =new ImageIcon("resources/bankBanner").getImage();
        Image scaledInstance=image.getScaledInstance(300,75, Image.SCALE_SMOOTH);
        bannerIcn=new ImageIcon(scaledInstance);
        bannerLbl=new JLabel(bannerIcn);
        JPanel bannerPanel=new JPanel();
        bannerPanel.add(bannerLbl);
        bannerLbl.setBounds(0,0,600,100);
        bannerPanel.setBorder(new LineBorder(Color.BLUE));
        mainFr.add(bannerPanel);

        List<Account> currentUserAccounts=currentUser.getBankAccounts();
        List<String> currentsUserIbans=new ArrayList<>();
        for(Account account: currentUserAccounts){
            currentsUserIbans.add(account.getIBAN());

        }
        menuAccounts=new JComboBox(currentsUserIbans.toArray());
        menuAccounts.addItemListener(this);
        JPanel menuPanel=new JPanel();
        menuPanel.setBorder(new LineBorder(Color.RED));
        menuPanel.add(menuAccounts);
        mainFr.add(menuPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
