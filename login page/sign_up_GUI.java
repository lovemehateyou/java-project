import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class sign_up_GUI {
    public sign_up_GUI(){
        JFrame frame = new JFrame("Connecting to a service");
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel label = new JLabel("Connecting to a service");

        label.setFont(new Font("Arial", Font.PLAIN, 25));
        label.setForeground(Color.GRAY);
        label.setBackground(Color.LIGHT_GRAY);

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, -60, 50, 0);
        frame.add(label,c);
        JLabel label2 = new JLabel("Sign In");

        label2.setFont(new Font("Arial", Font.PLAIN, 45));
        label2.setForeground(Color.GRAY);

        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 0, 35, 0);
        frame.add(label2,c);

        JLabel label3 = new JLabel("Sign in with your work or school account");
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        c.gridx = 0;
        c.gridy = 2;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 0, 35, 0);
        frame.add(label3,c);

        JTextField field = new JTextField(50);
        field.setToolTipText("Username");
        field.setText("Username");
        c.gridx = 0;
        c.gridy = 3;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 0, 5, 0);
        frame.add(field,c);

        JTextField field2 = new JTextField(50);
        field2.setToolTipText("Password");
        field2.setText("Password");
        c.gridx = 0;
        c.gridy = 4;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 0, 30, 0);
        frame.add(field2,c);

        JButton button1 = new JButton("Sign in");
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        button1.setPreferredSize(new Dimension(80, 30));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String text1;
                String text2;
                boolean answer;
                text1 = field.getText();
                text2 = field2.getText();
                answer = sign_up_lSQL.search(text1, text2);
                if (answer){
                    JOptionPane.showMessageDialog(null, "THE USERNAME AND PASSWORD EXIST");
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO USERNAME OR PASSWORD LIKE THIS EXISTS");
                    field.setText("");
                    field2.setText("");
                }
            }
        });
            
        c.gridx = 0;
        c.gridy = 5;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 0, 0, 0);
        frame.add(button1,c);

        JButton button2 = new JButton("Cancel");
        button2.setBackground(Color.GRAY);
        button2.setPreferredSize(new Dimension(80, 30));
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                field.setText("");
                field2.setText("");
            }
        });
        c.gridx = 1;
        c.gridy = 5;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, -370, 0, 0);
        frame.add(button2,c);
        
        frame.setVisible(true);
    }
    


}
