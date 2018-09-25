
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;



/**
 *
 * @author Lauro Ribeiro
 */
public class NewKeyViewer extends JFrame{
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text Field");
    
    public NewKeyViewer(){
        super("NewKeyViewer");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent input){
                char key = input.getKeyChar();
                keyLabel.setText("You pressed " + key);
            }
        });
        
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            
        }
    }
    
    public static void main(String[] arguments){
        new NewKeyViewer();
    }
}
