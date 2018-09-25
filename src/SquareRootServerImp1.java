
import java.util.Date;


/**
 *
 * @author Lauro Ribeiro
 */
public class SquareRootServerImp1 implements SquareRootServer {

    @Override
    public double getSquareRoot(double input) {
        return Math.sqrt(input);
    }

    @Override
    public String getTime() {
        Date now = new Date();
        return now.toString();
    }
    
}
