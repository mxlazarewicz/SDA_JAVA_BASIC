package Java_1_mz_OOP;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Marek", "Nowak", 33, new Address("Rzemieślnicza", "Mielno", "Polska", 7, 6));
        person1.introduce();
        person2.introduce();
        person2.getAddress().showAdress1();
        person2.setAddress(new Address("Maltanska", "Legionowo", "RPA", 7, 4));
        person2.getAddress().showAdress1();
        Engine v8 = new Engine(5450, 700, 30);
        SportCar ferarri = new SportCar("Ferari", "f50", "red", 2, v8);
        System.out.println(ferarri.toString());
        System.out.println(ferarri.getRadio());
        System.out.println(ferarri.makeSound());


    }
}
