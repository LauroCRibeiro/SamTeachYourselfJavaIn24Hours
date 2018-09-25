
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
/**
 *
 * @author Lauro Ribeiro
 */
public interface SquareRootServer {
    //get the square root of a number
    
    double getSquareRoot(double input);
    
    String getTime();
    
}
