package com.company;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MainApp2 extends JFrame {
    public JButton button = new JButton("Click");
    public JTextField input = new JTextField();
    public JLabel label = new JLabel("Input: ");
    public JRadioButton radio1 = new JRadioButton("1");
    public JRadioButton radio2 = new JRadioButton("2");
    public JCheckBox check = new JCheckBox("Check", false);

    public MainApp2(){
        super("GUI");
        int width = 400;
        int height = 300;
        int y;
        int x;
        x = 1920/2 - (width/2);
        y = 1080/2 - (height/2);
        this.setBounds(x,y,width,height);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        GridLayout grid = new GridLayout(6,1,10,2);
        container.setLayout(grid);
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        label.setForeground(Color.white);
        Font myfont = new Font("Dialog", Font.BOLD , 40);
        label.setFont(myfont);
        Border thisBorder = BorderFactory.createTitledBorder("");
        label.setBorder(thisBorder);
        radio1.setSelected(true);
        container.add(radio1);
        container.add(radio2);
        container.add(check);

        button.setMnemonic(KeyEvent.VK_ENTER);
        button.addActionListener(new ButtonEventListener());
        container.add(button);

    }
    class ButtonEventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String message = "";
            message += "Button was pressed \n";
            message += "Text from input is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio1 is selected \n" : "Radio2 is selected \n");
            message += (check.isSelected() ? "Checked \n" : "Unchecked \n");
            System.out.println(message);
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
