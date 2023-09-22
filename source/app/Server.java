package source.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    static Font font = new Font("SAN_SERIF", Font.BOLD, 19);

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


        inputFiled();
    }

    public void windowLayout() {

        setLayout(null);

       // topbar
        panel.setBackground(new Color(7,94,84));
        panel.setBounds(0, 0, 450, 70);
        add(panel);
        panel.setLayout(null);


        leftIcon();
        profileImage();
        videoIcon();
        phoneIcon();
        dotIcon();
        profileName();
        profileStatus();

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
    public void profileImage(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/profile.png"));

        Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon cnvIcon = new ImageIcon(img);

        JLabel profile = new JLabel(cnvIcon);
        profile.setLayout(null);
        profile.setBounds(40, 10, 50, 50);
        panel.add(profile);

        profile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                System.out.println("Clicked on profile");
            }
        });
    }

    public void videoIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/video.png"));

        Image img = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon cnvIcon = new ImageIcon(img);

        JLabel video = new JLabel(cnvIcon);
        System.out.println(video);
//        video.setLayout(null);
        video.setBounds(300, 20, 30, 30);
        panel.add(video);

        video.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                System.out.println("Clicked on video icon");
            }
        });
    }

    public void phoneIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/phone.png"));

        Image img = icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        ImageIcon cnvIcon = new ImageIcon(img);

        JLabel phone = new JLabel(cnvIcon);
//        video.setLayout(null);
        phone.setBounds(360, 20, 30, 30);
        panel.add(phone);

        phone.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                System.out.println("Clicked on phone icon");
            }
        });
    }

    public void dotIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/dot.png"));

        Image img = icon.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon cnvIcon = new ImageIcon(img);
        JLabel dot = new JLabel(cnvIcon);
        dot.setBounds(420,20,10,25);
        panel.add(dot);

        dot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                System.out.println("Clicked on dot icon");
            }
        });
    }

    public void profileName(){
        JLabel profileName = new JLabel("Sabbir Hossain");
        profileName.setBounds(110, 15, 120,18);
        profileName.setForeground(Color.white);
        profileName.setFont(font);
        panel.add(profileName);
    }

    public void profileStatus(){
        JLabel status = new JLabel("Online");
        status.setBounds(110, 35, 120, 18);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        status.setForeground(Color.cyan);
        panel.add(status);
    }

    public void inputFiled(){
        panel.setBounds(5, 75, 440, 570);
        panel.setBackground(Color.lightGray);
        add(panel);
    }
}
