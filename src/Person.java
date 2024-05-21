public class Person {
    private final String fullName;
    private final int age;

    public Person() {
        this.fullName = "Vinarchik Vitaliy";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається");
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Vinarchik Vitaliy", 19);

        person1.move();
        person2.talk();
    }
}