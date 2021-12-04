package JpanelLab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Formularz extends JPanel {
    private JFormattedTextField PanelName;
    private JFormattedTextField PanelLastName;
    private JFormattedTextField PanelLogin;
    private JPasswordField PanelPassword;
    private JPasswordField PanelRePassword;
    private JButton buttonRegister;
    private JButton buttonRegulamin;
    private JPanel Panel2;

    public JFormattedTextField getPanelName() {
        return PanelName;
    }

    public JFormattedTextField getPanelLastName() {
        return PanelLastName;
    }

    public JFormattedTextField getPanelLogin() {
        //Sprawdzenie czy login już nie istnieje
        return PanelLogin;
    }

    public Formularz() {

        add(Panel2);

        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = PanelName.getText();
                String LastName = PanelLastName.getText();
                String Login = PanelLogin.getText();
                String Pswrd = new String(PanelPassword.getPassword());
                String RePswrd = new String(PanelRePassword.getPassword());
                boolean ctnue = true;

                System.out.println("Imie: " + Name + ", Nazwisko: " + LastName + ", Login: " + Login +", Hasło: " + Pswrd);
                do {
                    if (RePswrd.equals(Pswrd)) {
                        System.out.println("utworzono hasło: " + Pswrd);
                        ctnue = false;
                    } else {
                        System.out.println("hasła muszą być takie same");
                        break;
                    }
                }while (ctnue);
            }
        });
        buttonRegulamin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("wyswietlam regulamin");
            }
        });
        PanelName.addComponentListener(new ComponentAdapter() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
        PanelLastName.addComponentListener(new ComponentAdapter() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
        PanelLogin.addComponentListener(new ComponentAdapter() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
        PanelPassword.addComponentListener(new ComponentAdapter() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
        PanelRePassword.addComponentListener(new ComponentAdapter() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
    }
}
