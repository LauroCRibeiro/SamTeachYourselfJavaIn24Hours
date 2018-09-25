
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;



/**
 *
 * @author Lauro Ribeiro
 */
public class KeyViewer extends JFrame implements KeyListener{

    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");
    
    public KeyViewer(){
        super("KeyViewer");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }
    public void keyTyped(KeyEvent input){
        char key = input.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }
    
    public void keyPressed(KeyEvent txt){
        //do nothing
    }
    public void keyReleased(KeyEvent txt){
        //do nothing
    }
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            //ignor error
        }
        
       
    }
       public static void main(String[] arguments){
            KeyViewer frame = new KeyViewer();
        }
}
