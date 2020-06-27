package CollectionExercises;

import java.util.ArrayList;

public class Ex1Collection {

    public static void arrayListInteger(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<=3; i++){
            int random = (int)(Math.random()*99);
            numbers.add(random);
        }
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(numbers.size()-1));


    }
}
