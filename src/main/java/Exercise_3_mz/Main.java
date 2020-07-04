package Exercise_3_mz;

import java.util.ArrayList;

public class Main implements Movable {

    public static void main(String[] args) {

        ArrayList<Cat> arrayOfCats = new ArrayList<>();


        Cat pers = new Cat("Mruczek");
        Cat brytyjski = new Cat("John");
        Cat dachowiec = new Cat("Noobek");
        Cat maly = new Cat("Puszek");
        Dog figo = new Dog("Figo");
        Dog andziej = new Dog("Andziej");
        Dog zuzioa = new Dog ("Zuzia");
        ArrayList<Object> animals = new ArrayList<>();


        arrayOfCats.add(pers);
        arrayOfCats.add(brytyjski);
        arrayOfCats.add(dachowiec);
        arrayOfCats.add(maly);

        animals.add(andziej);
        animals.add(zuzioa);
        animals.add(figo);
        animals.add(pers);
        animals.add(dachowiec);
        animals.add(brytyjski);

        for (int i = 0; i<animals.size()-1; i++) {
            int c = i;
            animals.get(c);

        }
        Vet weterynarz = new Vet();
        weterynarz.sayHello(pers);


    }
}
