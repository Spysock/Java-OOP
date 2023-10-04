import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FirstGui {
    private JFrame window;

    /**
     * This is a default constructor for the class FirstGui
     */
    public FirstGui(){
        window = new JFrame();
        window.setTitle("Lab 11");
        window.setSize(600,400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.show(true);

    }

    /**
     * This is an overloaded constructor for the class FirstGui
     */
    public FirstGui(String title, int width, int height){
        window = new JFrame();
        window.setTitle(title);
        window.setSize(width,height);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.show(true);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        window.add(panel,BorderLayout.EAST);
        panel.setBackground(Color.red);

        Button button1 = new Button("Process");
        panel.add(button1);
        Button button2 = new Button("Clear");
        panel.add(button2);
        Button button3 = new Button("Quit");
        panel.add(button3);

        panel.setPreferredSize(new Dimension(150,150));

        JPanel panel_name = new JPanel();
        JTextField field_first = createTextField("First Name");
        panel_name.add(field_first);
        JTextField field_last = createTextField("Last Name");
        panel_name.add(field_last);
        panel_name.setPreferredSize(new Dimension(150,50));
        window.add(panel_name, BorderLayout.CENTER);
        panel_name.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        JPanel panel_label = new JPanel();
        JLabel label_first = createLabel("First Name");
        panel_label.add(label_first);
        JLabel label_last = createLabel("Last Name");
        panel_label.add(label_last);
        panel_label.setPreferredSize(new Dimension(150,50));
        window.add(panel_label, BorderLayout.WEST);
        panel_label.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Hello " + field_first.getText() + " " + field_last.getText());
            }
        });

        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                field_first.setText("");
                field_last.setText("");
            }
        });
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

    }

    /**
     * This class makes the window visible or invisible.
     *
     * Giving it a parameter of true will make it visible and false invisible.
     */
    public void show(boolean tf){
        if(tf==true){
            window.show();
        }
        else{
            window.hide();
        }
    }
    /**
     * This method will take a string as input parameter and return a JTextField.
     * This will use the string input parameter as text for a tool tip.
     *
     */
    public JTextField createTextField(String s){
        JTextField field = new JTextField(10);
        field.setToolTipText(s);
        return field;

    }
    /**
     * This method will take a string asn input and return a JLabel with the String as its text displayed
     */
    public JLabel createLabel(String s){
        JLabel label = new JLabel(s);
        Font font = new Font("Calibri", Font.PLAIN, 18);
        label.setFont(font);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        return label;
    }
}
