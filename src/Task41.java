public class Task41 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("BMW", "Black", 330);
        Truck truck = new Truck("Chevrolet", "Red", 450);

        sedan.gas();
        truck.gas();

        sedan.brake();
        truck.brake();
    }
}