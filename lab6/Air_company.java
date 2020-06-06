package lab6;

import java.util.Arrays;
import java.util.Comparator;

public class Air_company {
    public Planes [] hangar = new Planes[3];
    public int counter;
    public void add_planes (Planes obj){
        hangar [counter++] = obj;
    }
    public void diapason_getter (Planes [] y, int a, int b){
        Planes [] array = Planes.fuel_getter(y, a, b);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void range_sort(Planes [] x){
        Arrays.sort(x, new sort_range_of_flight());
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i].getClass().getSimpleName() + " - дальність польоту - " + x[i].flying_range + " км");
        }
    }
}
class sort_range_of_flight implements Comparator<Planes> {
    @Override
    public int compare( Planes o1, Planes o2){return (o2.flying_range - o1.flying_range);
    }
}
