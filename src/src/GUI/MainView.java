package GUI;
import sun.applet.Main;

import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;
public class MainView  extends JFrame{
    static GraphicsConfiguration gc;
        JFrame frame = new JFrame(gc);
        public MainView(){
            this.frame.setVisible(true);
            this.frame.setTitle("SUPP Tracker");
            this.frame.setSize(600,400);
            this.frame.setLocation(200,200);
            this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.frame.setResizable(false);

        }

}
