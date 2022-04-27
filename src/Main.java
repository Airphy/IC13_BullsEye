import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    // Overriding the paint methods to add things to our canvas
    @Override
    public void paint(Graphics canvas)
    {
        int width = 350;
        int height = 350;
        int x = 60;
        int y = 60;


        for (int i = 0; i < 7; i++) {

            if(i % 2 == 0) canvas.setColor(Color.red);
            else canvas.setColor(Color.WHITE);
           
            canvas.fillOval(x,y,width,height);
            width -= 50;
            height -= 50;
            x +=25;
            y +=25;
        }

    }

    public static void main(String[] args) {

        //Instantiate JFrame (Outer Window)
        JFrame frame = new JFrame();
        frame.setTitle("Bullseye");
        frame.setSize(480, 480);


        // add the Jpanel to the Jframe
        frame.add(new Main());

        //By default, the frames are invisible
        frame.setVisible(true);
    }


}
