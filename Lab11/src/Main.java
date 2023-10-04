import javax.swing.*;
public class Main {

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                FirstGui the_first_one= new FirstGui();
                FirstGui the_second_one = new FirstGui("Lab 200", 300, 200);
            }
        });

    }


}
