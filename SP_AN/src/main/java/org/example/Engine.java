package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class Engine {
    private String engineMark;
    private int power;
    private int amountOfCylinders;

    public Engine(String engineMark, int power, int amountOfCylinders) {
        this.engineMark = engineMark;
        this.power = power;
        this.amountOfCylinders = amountOfCylinders;
    }
}
