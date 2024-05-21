public class Task1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Grigorskiy Ostap", 18);

        person1.move();
        person2.talk();
    }
}