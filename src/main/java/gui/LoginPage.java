package gui;
import controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginPage extends JPanel{

    private Controller controller = new Controller();
    private JPanel panel1;
    private JLabel passwordLabel;
    private JLabel usernameLabel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton accediButton;
    private JLabel TitleField;

    public LoginPage(Controller controller) {
        this.controller = controller;
        setLayout(null);

        TitleField.setText("Aeroporto di Napoli");
        Font font = new Font("Arial", Font.BOLD, 18);
        TitleField.setFont(font);
        TitleField.setBounds(10, 10, 300, 50);
        add(TitleField);

        usernameLabel.setText("Username");
        usernameLabel.setBounds(100, 100, 100, 25);
        add(usernameLabel);

        //textField1 = new JTextField();
        textField1.setBounds(200, 100, 200, 25);
        add(textField1);

        passwordLabel.setText("Password");
        passwordLabel.setBounds(100, 150, 100, 25);
        add(passwordLabel);

        //passwordField1 = new JPasswordField();
        passwordField1.setBounds(200, 150, 200, 25);
        add(passwordField1);

        accediButton.setText("Accedi");
        accediButton.setBounds(200, 200, 100, 30);
        add(accediButton);

        accediButton.addActionListener(e -> {
           String username = textField1.getText();
           String password = String.valueOf(passwordField1.getPassword());


           if(controller.isAdmin(username, password)){
               Window finestraCorrente = SwingUtilities.getWindowAncestor(LoginPage.this);
               if(finestraCorrente != null){
                   finestraCorrente.setVisible(false);
               }
               JFrame AdminPage = new JFrame("Admin Page");
               AdminPanel adminpanel = new AdminPanel(controller, finestraCorrente);
               AdminPage.setSize(600, 400);
               AdminPage.setLocationRelativeTo(null);

               AdminPage.setVisible(true);
               AdminPage.setResizable(false);
               AdminPage.setLocationRelativeTo(null);
               AdminPage.setContentPane(new AdminPanel(controller, finestraCorrente));
               AdminPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               AdminPage.addWindowListener(new WindowAdapter() {
                   public void windowClosing(WindowEvent e) {
                       if(finestraCorrente != null){
                           finestraCorrente.dispose();
                       }
                   }
               });
           }
           else{
               Window finestraCorrente = SwingUtilities.getWindowAncestor(LoginPage.this);
               if(finestraCorrente != null){
                   finestraCorrente.setVisible(false);
               }
               JFrame UserPage = new JFrame("User Page");
               UserPage.setSize(600, 400);
               UserPage.setLocationRelativeTo(null);
               UserPage.setVisible(true);
               UserPage.setResizable(false);
               UserPage.setContentPane(new UserPanel(controller));
               UserPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               UserPage.addWindowListener(new WindowAdapter() {
                   public void windowClosing(WindowEvent e) {
                       if(finestraCorrente != null){
                           finestraCorrente.dispose();
                       }
                   }
               });
           }
        });
    }

}
