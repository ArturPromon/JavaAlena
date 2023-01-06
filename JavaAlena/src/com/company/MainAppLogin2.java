package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainAppLogin2 extends JFrame {
    public JLabel label1 = new JLabel("Username");
    public JLabel label2 = new JLabel("Password");
    public JLabel label3 = new JLabel("");
    public JLabel label4 = new JLabel("Not a member? ");
    public JLabel label5 = new JLabel("Sign up!");
    public JButton button = new JButton("Login");
    public JTextField usernameinput = new JTextField();
    public JTextField passwordinput = new JTextField();

    MainAppLogin2(){
        super("Login form");
        this.setBounds(300,300,290,230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(null);
        label1.setBounds(10,0,100,30);
        usernameinput.setBounds(10,30,150,20);
        label2.setBounds(10,50,100,30);
        passwordinput.setBounds(10,80,150,20);
        button.setBounds(10,110,100,30);
        label3.setBounds(10,140,200,20);
        label4.setBounds(70,160,90,30);
        label5.setBounds(160,160,60,30);
        label5.setForeground(Color.magenta);
        Font myfont = new Font("Helvetica", Font.ITALIC, 15);
        label5.setFont(myfont);
        label5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame;
                frame = new JFrame("Signup form");
                frame.setVisible(true);
                frame.setSize(290,230);
                Container container2 = new Container();
                container2 = frame.getContentPane();
                container2.setLayout(null);
                label1.setBounds(10,0,100,30);
                usernameinput.setBounds(10,30,150,20);
                label2.setBounds(10,50,100,30);
                passwordinput.setBounds(10,80,150,20);
                button.setBounds(10,110,100,30);
                label3.setBounds(10,140,200,20);
                label4.setBounds(70,160,90,30);
                label5.setBounds(160,160,60,30);
                container2.add(label1);
                container2.add(usernameinput);
                container2.add(label2);
                container2.add(passwordinput);
                container2.add(button);
                container2.add(label3);
                container2.add(label4);
                container2.add(label5);
            }
        });

        Point point = new Point(0,0);
        Toolkit tkit = Toolkit.getDefaultToolkit();
        Image img = tkit.getImage("pointer.png");
        Cursor cursor = tkit.createCustomCursor(img,point, "pointer");
        label5.setCursor(cursor);

        container.add(label1);
        container.add(usernameinput);
        container.add(label2);
        container.add(passwordinput);
        container.add(button);
        container.add(label3);
        container.add(label4);
        container.add(label5);

        button.addActionListener(new Events());
    }

    class Events implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = "Artur";
            String password = "2023";
            if(username.equals(usernameinput.getText()) && password.equals(passwordinput.getText()) ){
                JFrame frame = new JFrame("New frame");
                frame.setSize(200,200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }else{
                label3.setText("Wrong password or login");
            }

        }
    }
}
