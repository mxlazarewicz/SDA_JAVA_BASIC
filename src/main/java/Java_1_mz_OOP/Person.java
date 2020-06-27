package Java_1_mz_OOP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Person() {
        this.name = "Marian";
        this.surname = "Kowalski";
        this.age = 45;

    }
    public void introduce(){
        System.out.println("Mam na imię " + this.name + "na nazwisko: " + this.surname);
    }
//    public Person(String name, String surname, int age) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//

}