public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mazda", 4);
        Car car2 = new Car("Toyota",4);

        Truck truck = new Truck("Man", 6);
        Truck truck2 = new Truck("Volvo", 4);

        Bicycle bicycle = new Bicycle("Stels", 2);
        Bicycle bicycle2 = new Bicycle("Author", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
    }
}