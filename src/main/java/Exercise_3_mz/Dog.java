package Exercise_3_mz;
public class Dog implements Movable {
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("To jest pies: " + this.name + "howhowhowho");
    }
    public void move(){
        System.out.println("Idę");
    }
}
