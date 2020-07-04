package Java_1_mz_OOP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SportCar extends Car {
    private String radio;
    private String sound;

    public SportCar(String producer, String model, String color, Integer numberOfSeats, Engine engine) {
        super(producer, model, color, numberOfSeats, engine);
        this.sound = "Wrrrrrrr";
    }

    public String makeSound() {
        return this.sound;
    }

}
