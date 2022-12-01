import jdk.jfr.DataAmount;
import jdk.jfr.Name;
import java.util.ArrayList;
@Name("Benjamin Franklin"
)
@DataAmount("3/27/2003")
@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Underground");
        for (int i = 0; i < cars.size(); i++) {
        }
        ArrayList<Integer> mane = new ArrayList<Integer>();
        mane.add(3000000);
        mane.add(4000000);
        mane.add(5000000);
        mane.add(6000000);
        mane.add(6000);
        for (int i=0; i<mane.size();i++){

        }
       ArrayList<String> name = new ArrayList<String>();
        name.add("Bob");
        name.add("Josh");
        name.add("Sem");
        name.add("Robert");
        name.add("Ann");
        for (int i=0 ; i < name.size();i++){
            System.out.println(name.get(i) + " "+cars.get(i) + " " +mane.get(i) );

        }
    }

    }
