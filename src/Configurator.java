
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;


/**
 *
 * @author Lauro Ribeiro
 */
public class Configurator {
    
    public Configurator() throws FileNotFoundException, IOException{
        try{
            //load the properties file
            File configFile = new File("program.properties");
            FileInputStream inStream = new FileInputStream(configFile);
            Properties config = new Properties();
            config.load(inStream);
            //create a new property
            Date current = new Date();
            config.setProperty("runtime", current.toString());
            //save the properties file
            FileOutputStream outStream = new FileOutputStream(configFile);
            config.store(outStream, "Properties settings");
            inStream.close();
            config.list(System.out);
        }catch(IOException ioe){
            System.out.println("IO error " + ioe.getMessage());
        }
    }
    
    public static void main(String[] arguments) throws IOException{
        Configurator con = new Configurator();
    }
}
