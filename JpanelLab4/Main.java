package JpanelLab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("APP");
        JPanel oknoglowne = new JPanel();
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("menu");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        oknoglowne.setLayout(new BorderLayout());
        oknoglowne.add(new CustomJPanel(), BorderLayout.CENTER);

        JMenuItem szachownica = new JMenuItem("szachownica");
        JMenuItem kalkulator = new JMenuItem("kalkulator");
        JMenuItem formularz = new JMenuItem("formularz");

        frame.add(oknoglowne, BorderLayout.CENTER);

        menu.add(szachownica);
        menu.add(kalkulator);
        menu.add(formularz);

        menubar.add(menu);
        frame.add(menubar, BorderLayout.NORTH);

        ActionListener sluchacz = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String var = e.getActionCommand();
                if(var.equals("kalkulator")){

                    BorderLayout layout = (BorderLayout) oknoglowne.getLayout();
                    oknoglowne.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    oknoglowne.add(new Calculator(),BorderLayout.CENTER);
                    JFrame frame = new JFrame("Calculator");
                    frame.pack();
                }
                if (var.equals("szachownica")){

                    BorderLayout layout = (BorderLayout) oknoglowne.getLayout();
                    oknoglowne.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    oknoglowne.add(new CustomJPanel(),BorderLayout.CENTER);
                    frame.pack();
                }
                if(var.equals("formularz")){

                    BorderLayout layout = (BorderLayout) oknoglowne.getLayout();
                    oknoglowne.remove(layout.getLayoutComponent(BorderLayout.CENTER));
                    oknoglowne.add(new Formularz(),BorderLayout.CENTER);
                    frame.pack();
                }
            }
        };

        kalkulator.addActionListener(sluchacz);
        szachownica.addActionListener(sluchacz);
        formularz.addActionListener(sluchacz);

        frame.pack();
        frame.setVisible(true);
    }
}
