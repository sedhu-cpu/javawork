import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
    ArrayList<String> car = new ArrayList<String>();
    car.add("Mazda");
    car.add("Maruti");
    ArrayList<String> cars= new ArrayList<String>();
    cars.add("Porsche");
    cars.add("Ferrari");
    ArrayList<String> carss = new ArrayList<String>();
    carss.addAll(car);
    carss.addAll(cars);
    Collections.sort(carss);
    for(int i = 0; i < 4 ; i++){
        System.out.print(" "+ carss.get(i));
    }    
    }
    
}
