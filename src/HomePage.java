
import java.net.MalformedURLException;
import java.net.URL;


/**
 *
 * @author Lauro Ribeiro
 */
public class HomePage {
    String owner;
    URL address;
    String category = "none";
    
    public HomePage(String inOwner, String inAddress)
            throws MalformedURLException{
        owner = inOwner;
        address = new URL(inAddress);
    }
    
    public HomePage(String inOwner, String inAddress, String inCategory)
            throws MalformedURLException{
        this(inOwner , inAddress);
        category = inCategory;
    }
}
