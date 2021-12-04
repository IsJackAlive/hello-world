package JpanelLab4;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

    public class CustomJPanel extends JPanel {
        CustomJPanel(){
            super.setPreferredSize(new Dimension(800,800));
        }

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d =(Graphics2D) g;

        //Rectangle2D rec = new Rectangle2D.Double(10,20,30,40);

            for (int i= 0; i<8; i++) {

                for(int j=0; j<8; j++){

                    Rectangle2D rec = new Rectangle2D.Double(i * 100, j * 100, 100, 100);

                    if( (i+j) %2==0){
                        g2d.setPaint(Color.BLACK);
                        g2d.fill(rec);
                    } else {
                        g2d.setPaint(Color.WHITE);
                        g2d.fill(rec);
                    }
                    }
                }
            }
    }