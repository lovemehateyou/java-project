import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mydemo3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextFiledDemo");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
    

        
        JTextField text = new JTextField(20);
        text.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String input = text.getText();
                label.setText(input);
                
            }
        });
        panel.add(text);
        panel.add(label);
        frame.add(panel);
        frame.setSize(300,200);
        frame.setVisible(true);

    }

}
