package com.ruslanito.Core.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/*C:\Users\Ruslan\IdeaProjects\JavaX\src\com\ruslanito\Core\Swing\SwingCreate\Swing_CreateMethod.java*/

public class JComponent1 {
    public static void main(String[] args) {
        JFrame jframe = getFrame();
//      define font
//        Font font = new Font("Arial", Font.BOLD, 20);

        /* get available fonts from system
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String str:fonts) {
            System.out.println(str);
        }*/

//        add MyComponent to jframe
        jframe.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
//add text in window
            Font font = new Font("Arial", Font.BOLD, 20);
            g2.setFont(font);
            g2.drawString("Hello World!", 200, 20);// font and start point (from left top corner)

//add line in window
            Line2D l2 = new Line2D.Double(70, 70, 190, 190);//coordinates of line
            g2.draw(l2);

//line through points
            Point2D p1 = new Point2D.Double(80,80);
            Point2D p2 = new Point2D.Double(200,200);
            Line2D l3 = new Line2D.Double(p1, p2);
            g2.draw(l3);

//ellipse
            Ellipse2D el = new Ellipse2D.Double(100,100,150,200);
//            g2.draw(el); //draw ellipse
//            g2.setPaint(new Color(12,12,255));//add color for filling
            g2.setPaint(Color.ORANGE);// 2-nd variant for add color for filling
            g2.fill(el);//draw ellipse with fill it

//rectangle
            Rectangle2D rec = new Rectangle2D.Double(250,120,150,40);
            g2.setPaint(Color.CYAN);
            g2.draw(rec);

//image



        }
    }

    static JFrame getFrame() {
        JFrame jframe = new JFrame("Window");
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jframe.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
        return jframe;
    }
}
