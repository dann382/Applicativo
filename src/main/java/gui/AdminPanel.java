package gui;
import controller.Controller;
import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JPanel{
    private JPanel panel1;
    private JLabel AdminLabel;
    private JButton testButton;
    private JPanel Opzione1;
    private JButton test2Button;
    private JButton visualizzaVoliButton;
    private JButton aggiornaVoloButton;
    private JButton logoutButton;
    private Controller controller;
    private Window loginWindow;

    public AdminPanel(Controller controller, Window loginWindow) {
        this.controller = controller;
        this.loginWindow = loginWindow;
        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.CENTER);

        AdminLabel.setText("Benvenuto, Amministratore");
        Font font = new Font("Arial", Font.BOLD, 18);
        AdminLabel.setFont(font);
        AdminLabel.setBounds(10, 10, 300, 30);
        //add(AdminLabel);

        test2Button.addActionListener(e -> {});
        logoutButton.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(this).dispose();
            if(loginWindow != null){
                loginWindow.setVisible(true);
            }
        });


    }

}
