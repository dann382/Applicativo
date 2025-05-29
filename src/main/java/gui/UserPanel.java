package gui;
import javax.swing.*;
import java.awt.*;
import controller.Controller;

public class UserPanel extends JPanel{
    private Controller controller = new Controller();
    private JPanel panel1;
    private JLabel Title;
    private JButton ricercaVoliButton;
    private JButton vediModificaPrenotazioniButton;


    public UserPanel(Controller controller){
        this.controller = controller;
        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.CENTER);
        Font font = new Font("Arial", Font.BOLD, 18);
        Title.setFont(font);
        Title.setText("Area Personale");

    }
}
