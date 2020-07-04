package Exercise_3_mz;

import java.util.Objects;

public class Vet {
    private Cat cat;
    private Dog dog;

    public void sayHello(Cat cat){
        this.cat = cat;
        System.out.println("Witaj " + this.cat.getName());

    }
    public void  sayHello(Dog dog) {
        this.dog = dog;
        System.out.println("Witaj " + this.dog.getName());
    }






    }

