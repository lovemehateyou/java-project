import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class Mydemo{
    public static void main(String[] args) {
       JFrame wframe = new JFrame("JCheckboxDemo");
       JPanel panel = new JPanel();
       wframe.setSize(300, 200);
       wframe.setBackground(Color.blue);
       
       //creating a checkbox
       JCheckBox check = new JCheckBox("c");
       check.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        JLabel label = new JLabel("c got selected");
                panel.add(label);
                wframe.revalidate();
            }
       });
       JCheckBox check2 = new JCheckBox("c++");
       check2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        JLabel label = new JLabel("c++ got selected");
                panel.add(label);
                wframe.revalidate();
            }
       });
       JCheckBox check3 = new JCheckBox("java");
       check3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        JLabel label = new JLabel("java got selected");
                panel.add(label);
                wframe.revalidate();
            }
       });
       JCheckBox check4 = new JCheckBox("perl");
       check4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        JLabel label = new JLabel("perl got selected");
                panel.add(label);
                wframe.revalidate();
            }
       });

       
        // adding the checkbox to the frame
        panel.add(check);
        panel.add(check2);
        panel.add(check3);
        panel.add(check4);

        wframe.setSize(300,200);
        wframe.add(panel);
        wframe.setVisible(true);




    }
}