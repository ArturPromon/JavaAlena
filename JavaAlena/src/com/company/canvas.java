package com.company;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
/*from   ww w .  j a  v a  2s . c  o  m*/
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        String s = "java2s.com";

        Font font = new Font("Courier", Font.PLAIN, 40);
        g2d.translate(20, 200);

        FontRenderContext frc = g2d.getFontRenderContext();

        GlyphVector gv = font.createGlyphVector(frc, s);
        int length = gv.getNumGlyphs();
        System.out.println(length);
        g2d.draw(gv.getOutline());
    }
}

public class canvas {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 450, 450);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }
}