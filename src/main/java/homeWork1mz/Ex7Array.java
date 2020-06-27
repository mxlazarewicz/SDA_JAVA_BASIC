package homeWork1mz;

import java.util.ArrayList;

public class Ex7Array {
    public static void arrayNumbers(){
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i <=6; i++){
            int random = (int)(Math.random()*99);
            listOfNumbers.add(random);
            int index = i;
            if (index <5){
                System.out.println(listOfNumbers.get(index));
            }
            else {
                System.out.println("Przekroczono rozmiar tablicy");
            }
        }

    }
}


