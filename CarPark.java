import java.util.*;
public class CarPark {
    ArrayList<Car> c;
    CarPark(){
        c = new ArrayList<Car>();
    }
    void add(Car cr){
        c.add(cr);
    }
    void del(String gn){
        int p = -1;
        for (int i = 0; i < c.size(); i++) {
            if(gn.equalsIgnoreCase(c.get(i).getGos_number()))
                p = i;
        }
        if(p>-1){
            c.remove(p);
            System.out.println("Удалили машину с гос. номером: "+gn);
        }
        else System.out.println("Такой машины нет");
    }
    void print(){
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).toString());
        }
    }
    void sortByManufacture(){
        c.sort(Car.ManComparator);
    }
    void sortByMark(){
        c.sort(Car.MarkComparator);
    }
    void search(String p){
        for(Car car : c){
            if(car.getGos_number().equalsIgnoreCase(p)){
                System.out.println(car.toString());
            }
        }
    }
}
