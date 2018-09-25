
import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author Lauro Ribeiro
 */
public class StringLister {
    String[] names = {"Spanky" , "Alfafa", "Buckwheat", "Daria",
        "Stymie", "Marianne", " Scooty", "Tommy", "Chubby"
    };
    
    public StringLister(String[] moreNames){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < names.length; i++){
            list.add(names[i]);
        }
        for(int i= 0; i < moreNames.length; i++){
            list.add(moreNames[i]);
        }
        Collections.sort(list);
        for(String name : list){
            System.out.println(name);
        }
    }
    public static void main(String[] arguments){
        StringLister lister = new StringLister(arguments);
    }
}

            
            
