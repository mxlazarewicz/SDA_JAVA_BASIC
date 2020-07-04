package Java_1_mz_OOP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Car {
    protected String producer;
    protected String model;
    protected String color;
    protected Integer numbersOfSeat;
    protected Engine engine;

    public Car() {
        this.numbersOfSeat = 2;
    }

    public Car(String producer, String model, String color, Integer numbersOfSeat, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.numbersOfSeat = numbersOfSeat;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numbersOfSeat=" + numbersOfSeat +
                ", engine=" + engine +
                '}';
    }
}
