
/**
 *
 * @author Lauro Ribeiro
 */
public class Calculator {
    public static void main(String[] arguments){
        float sum = 35;
        for(String argument : arguments){
            sum = sum + Float.parseFloat(argument);
        }
        System.out.println("Those numbers add up to " + sum);
    }
}
