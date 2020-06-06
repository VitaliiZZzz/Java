package lab6;

public class Main {
    public static void main(String[] args) {
        Air_company airline = new Air_company();
        airline.add_planes(new Boeing737max(220, 20000, 6500, 35));
        airline.add_planes(new Airbus_a320neo(180, 16600, 6850, 24));
        airline.add_planes(new Comac_c919(174, 15000, 5500, 15));
        System.out.print("Загальна місткість: ");
        System.out.println(Planes.count_capacity(airline.hangar));
        System.out.println("Загальна вантажопідйомність: " + Planes.count_carrying_capacity(airline.hangar) + " кг");
        System.out.println("\nЛітак у заданому діапазоні споживання палива: ");
        airline.diapason_getter(airline.hangar, 16, 25);
        System.out.println("\nСортування за дальністю польоту: ");
        airline.range_sort(airline.hangar);
    }
}
