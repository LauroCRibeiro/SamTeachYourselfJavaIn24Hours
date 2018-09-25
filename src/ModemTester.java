

/**
 *
 * @author Lauro Ribeiro
 */
public class ModemTester {
    public static void main(String[] args){
        CableModem surfBoard =  new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 50000;
        gateway.speed = 40000;
        System.out.println("Trying the cable modem: ");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Trying the DSL modem: ");
        gateway.displaySpeed();
        gateway.connect();
        
    }
}
