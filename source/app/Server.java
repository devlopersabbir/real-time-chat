package source.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    static Font font = new Font("SansSerif", Font.BOLD, 30);

    Server() {
        // window layout
        windowLayout();
        // run window
        runWindow();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Server();
    }

    public void actionPerformed(ActionEvent event){

    }

    public void runWindow() {
        setTitle("Chat Application");
        setSize(450, 700);
        setResizable(false);
        setLocation(200, 50);
        getContentPane().setFont(font);
        getContentPane().setBackground(Color.white);
    }

    public void windowLayout() {
        setLayout(null);

        panel.setBackground(new Color(7,94,84));
        panel.setBounds(0, 0, 450, 70);
        add(panel);
        panel.setLayout(null);
        leftIcon();
    }

    public void leftIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/left.png"));

        Image img = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon cnvIcon = new ImageIcon(img);


        JLabel back = new JLabel(cnvIcon);
        back.setLayout(null);
        back.setBounds(5, 20, 25, 25);
        panel.add(back);

        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                System.exit(0);
            }
        });
    }
}
