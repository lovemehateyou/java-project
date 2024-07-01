import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class CleanerGUI {
    public static void GUI(){
    JFrame frame = new JFrame("TEXT CLEANER");
    frame.setSize(1000,1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel(new GridLayout(7, 1));
    
    JLabel label = new JLabel("Enter the text to be cleaned: ");
    JLabel label2 = new JLabel("The cleaned text: ");
    JLabel label3 = new JLabel("Main concept holding words: ");

    JTextArea textArea = new JTextArea(10, 20);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setSize(300,250);
    textArea.setText("ENTER TEXT HERE");
    JScrollPane scrollPane = new JScrollPane(textArea);
    
    JTextArea textArea2 = new JTextArea();
    textArea2.setLineWrap(true);
    textArea2.setWrapStyleWord(true);
    textArea2.setSize(300,250);
    JScrollPane scrollPane2 = new JScrollPane(textArea2);

    JTextArea textArea3 = new JTextArea();
    textArea3.setLineWrap(true);
    textArea3.setWrapStyleWord(true);
    textArea3.setSize(300,250);
    JScrollPane scrollPane3 = new JScrollPane(textArea3);
    

    JButton button = new JButton("Clean Text");
    button.setSize(60,60);
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String text = textArea.getText();
            String [] words;
            ArrayList <String> res;
            textclear.lower(text);
            textclear.remove_punc();
            textclear.num_remove(); 
            textclear. contractions();
            textclear.space_remove();
            words = textclear.change_word();
            res = text_operation.dictionary(words);

            String sentence = String.join(" ", words);
            textArea2.setText(sentence);
            String concept_words = String.join("\n ", res);
            textArea3.setText(concept_words);;

        }
        });
        JScrollPane scrolling = new JScrollPane(panel);
        
        panel.add(label);
        panel.add(scrollPane);
        panel.add(button);
        panel.add(label2);
        panel.add(scrollPane2);
        panel.add(label3);
        panel.add(scrollPane3);
        frame.add(scrolling);
        frame.setVisible(true);
 
    }  



}
