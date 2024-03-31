import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    static int clickCounter = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Кликер");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JLabel label = new JLabel(String.valueOf(clickCounter++),SwingConstants.CENTER);
        label.setFont(new Font("Vladimir script",Font.ITALIC,50));
        JButton button = new JButton("Click");
        button.addActionListener(e -> label.setText(String.valueOf(clickCounter++)));
        frame.add(label);
        frame.add(button,BorderLayout.SOUTH);
        frame.setVisible(true);




        }



    }
