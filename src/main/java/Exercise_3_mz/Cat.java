package Exercise_3_mz;

public class Cat implements Movable {
    private String name;

    public Cat(String name) {
        this.name = name;

    }

    public void makeSound(){
             System.out.println("To jest kot: " + this.name + " meeeoow" );
    }
    public void eatMouse(){
        int random = (int)(Math.random()*20);
        System.out.println("Kot " + this.name + " zjadł " + random + " myszy.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("Idę");

    }
}


