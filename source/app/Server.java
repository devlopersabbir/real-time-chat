package source.app;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {

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

    public void runWindow() {
        Font font = new Font("SansSerif", Font.BOLD, 30);
        setTitle("Chat Application");
        setSize(450, 700);
        setResizable(false);
        getContentPane().setFont(font);
        getContentPane().setBackground(Color.white);
    }

    public void windowLayout() {
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(7, 94, 84));
        panel.setBounds(0, 0, 450, 70);
        add(panel);
    }
}
