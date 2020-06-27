package homeWork1mz;

public class Ex8String {


    public static void stringTraining(){
        String imie = "Olgierd";
        System.out.println(imie.toUpperCase());
        System.out.println(imie.toLowerCase());
        System.out.println(imie.length());
        System.out.println(imie.startsWith("O"));
        System.out.println(imie.contains("e"));
        char[] olgierd = imie.toCharArray();
        for(int i = 0; i<imie.length(); i++){
            System.out.println("[" + olgierd[i]+ "]" + "[" + i + "]");
        }

    }
    }

