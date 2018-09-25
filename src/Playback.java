
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;



/**
 *
 * @author Lauro Ribeiro
 */
public class Playback extends JFrame{
     public Playback(){
         super("Playback");
         setLookAndFeel();
         setSize(225, 80);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         FlowLayout flo = new FlowLayout();
         setLayout(flo);
         JButton play = new JButton("Play");
         JButton stop = new JButton("Stop");
         JButton pause = new JButton("Pause");
         add(play);
         add(stop);
         add(pause);
         setVisible(true);
     }
     
     private void setLookAndFeel(){
         try{
             UIManager.setLookAndFeel(
             "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
         }catch(Exception exc){
             //ignore error
         }
     }
     
     public static void main(String[] arguments){
         Playback frame = new Playback();
     }
}
