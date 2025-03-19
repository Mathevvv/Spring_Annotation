package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Engine {
    private String engineMark;
    private int power;
    private int amountOfCylinders;

    public Engine(@Value("${engine.engineMark}") String engineMark,
                  @Value("${engine.power}") int power,
                  @Value("${engine.amountOfCylinders}") int amountOfCylinders) {
        this.engineMark = engineMark;
        this.power = power;
        this.amountOfCylinders = amountOfCylinders;
    }
}
