package bg.smg.frame;

import javax.swing.*;

public class MainFrame extends JFrame {
private JLabel bannerLbl;
    private Icon bannerIcn;
    private JLabel screenTitle;

    public MainFrame(){
        this.setSize(600,500);
        this.setTitle("Bank app");

        bannerIcn=new ImageIcon("resources/bankBanner");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
