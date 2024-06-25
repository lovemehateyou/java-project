import javax.swing.*;
import java.awt.*;
public class Mydemo4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mydemo1");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel2.setLayout(new GridLayout(2, 1));
        panel.add(panel2);
        panel2.add(new JLabel("Fullname"));
        panel2.add(new JLabel("Fullname"));
        JPanel textplane = new JPanel();
        textplane.setLayout(new BoxLayout(textplane, BoxLayout.Y_AXIS));
        JTextArea text1 = new JTextArea();
        JTextArea text2 = new JTextArea();

        

        textplane.add(text1);
        textplane.add(Box.createVerticalStrut(5));
        textplane.add(text2);
        panel.add(textplane);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

    }
}
