package Java_1_mz_OOP;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Marek", "Nowak", 33, new Address("Rzemieślnicza", "Mielno", "Polska", 7, 6));
        person1.introduce();
        person2.introduce();
        person2.getAddress().showAdress1();
        person2.setAddress(new Address("Maltanska", "Legionowo", "RPA", 7, 4 ));
        person2.getAddress().showAdress1();
    }
}
