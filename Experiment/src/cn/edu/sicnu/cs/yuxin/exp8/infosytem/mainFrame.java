package cn.edu.sicnu.cs.yuxin.exp8.infosytem;

import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {
    public static void main(String[] args) {
        new mainFrame();
    }

    public mainFrame() {
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        setTitle("Information System");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setMinimumSize(new Dimension(480, 300));
        setMaximumSize(new Dimension(screenWidth, screenHeight));
        setSize(540, 320);
    }

    private JPanel mainPanel;
    private JTextField idCodeTextField;
    private JTextField nameTextField;
    private JButton submitButton;
    private JLabel idCodeLabel;
    private JLabel nameLabel;
    private JTree tree1;
}
