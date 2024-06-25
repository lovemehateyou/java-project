
import java.awt.*;
import javax.swing.*;
public class Mydemo2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setSize(500,500);
        JPanel panel = new JPanel(new BorderLayout(5,5));

        JButton button = new JButton("save-1");
        JButton button2 = new JButton("save-2");
        JButton button3 = new JButton("save-3");

        panel.add(BorderLayout.NORTH,button);
        panel.add(BorderLayout.WEST,button2);
        panel.add(BorderLayout.CENTER,button3);

        frame.add(panel);
        frame.setVisible(true);


    }
}