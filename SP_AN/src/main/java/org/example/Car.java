package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class Car {
    private String carMark;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;

    public Car(String carMark, Engine engine, Transmission transmission, Wheel wheel) {
        this.carMark = carMark;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
    }
}
