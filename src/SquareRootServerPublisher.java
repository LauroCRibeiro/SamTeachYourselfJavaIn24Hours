
import javax.xml.ws.Endpoint;



/**
 *
 * @author Lauro Ribeiro
 */
public class SquareRootServerPublisher {
    public static void main(String[] arguments){
        SquareRootServerImp1 srsi = new SquareRootServerImp1();
        Endpoint.publish("http://127.0.0.1:5335/Service",
                srsi);
    }
}
