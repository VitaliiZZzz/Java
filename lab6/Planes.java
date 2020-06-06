package lab6;

public class Planes {
    public int capacity;
    public int carying_cap;
    public int flying_range;
    public int fuel_consumption;
    public Planes (int cap, int car_cap, int fly_ran, int fuel_cons){
        capacity = cap;
        carying_cap = car_cap;
        flying_range = fly_ran;
        fuel_consumption = fuel_cons;
    }
    public static Planes [] fuel_getter(Planes [] y, int a, int b){
        int len_counter = 0;
        int counter = 0;
        for(int i = 0; i < y.length; i++){
            if (y[i].fuel_consumption >= a && y[i].fuel_consumption <= b){
                len_counter++;
            }
        }
        Planes [] consumption_range = new Planes[len_counter];
        for(int i = 0; i < y.length; i++){
            if (y[i].fuel_consumption >= a && y[i].fuel_consumption <= b) {
                consumption_range[counter++] = y[i];
            }
        }
        if (len_counter == 0) {
            return null;
        } else {
            return consumption_range;
        }
    }
    public static int count_capacity(Planes [] x){
        int capacity_counter = 0;
        for(int i = 0; i < x.length; i++){
            capacity_counter += x[i].capacity;
        }
        return capacity_counter;
    }
    public static int count_carrying_capacity(Planes [] x){
        int carrying_capacity_counter = 0;
        for(int i = 0; i < x.length; i++){
            carrying_capacity_counter += x[i].carying_cap;
        }
        return carrying_capacity_counter;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " - витрата пального: " + fuel_consumption;
    }
}
