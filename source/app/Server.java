package source.app;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame{

    Server() {
        windowLayout();
        runWindow();
    }

    public static void main(String[] args) {
        new Server();
    }

    public void runWindow(){
        Font font = new Font("SansSerif",Font.BOLD, 30);
        setTitle("Chat Application");
        setSize(450, 700);
        getContentPane().setFont(font);
        getContentPane().setBackground(Color.white);

        // visibility
        setVisible(true);
    }

    public void windowLayout(){
        setLayout(null);

    }

}
