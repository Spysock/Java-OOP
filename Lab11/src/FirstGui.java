import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
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
        window.add(panel,BorderLayout.NORTH);
        panel.setBackground(Color.red);

        Button start = new Button("Start");
        panel.add(start);
        Button quit = new Button("Quit");
        panel.add(quit);
        Button pause = new Button("Pause");
        panel.add(pause);

        panel.setPreferredSize(new Dimension(150,150));

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
}
