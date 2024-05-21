public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " (" + callerNumber + ")");
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... numbers) {
        System.out.print("Номера телефонів для відправки повідомлення: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("0996786667", "Samsung", 0.7);
        Phone phone2 = new Phone("0633636336", "Oppo", 0.3);
        Phone phone3 = new Phone("0736373673", "Xiaomi", 0.2);

        System.out.println("Телефон 1: номер - " + phone1.getNumber() + ", модель - " + phone1.model + ", вага - " + phone1.weight);
        System.out.println("Телефон 2: номер - " + phone2.getNumber() + ", модель - " + phone2.model + ", вага - " + phone2.weight);
        System.out.println("Телефон 3: номер - " + phone3.getNumber() + ", модель - " + phone3.model + ", вага - " + phone3.weight);

        phone1.receiveCall("Ostap Grigorskiy", "0736373673");
        phone2.receiveCall("Vinarchik Vitaliy", "0996786667");
        phone3.receiveCall("Zadorogniy Mihaylo", "0633636336");

        phone2.sendMessage("0736373673", "," , "0996786667", "," , "0633636336");
    }
}