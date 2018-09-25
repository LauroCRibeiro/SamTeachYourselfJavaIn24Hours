
import javax.swing.JFrame;
import javax.swing.UIManager;



/**
 *
 * @author Lauro Ribeiro
 */
public class SalutonFrame extends JFrame{
    
    public SalutonFrame(){
        super("Saluton mondo");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        
    }catch (Exception exc){
    //ignore error
  }
}
    public static void main(String[] arguments){
         SalutonFrame frame = new SalutonFrame();
    }
}
