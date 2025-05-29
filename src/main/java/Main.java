import javax.swing.*;
import gui.LoginPage;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new LoginPage(c));
            frame.pack();
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}