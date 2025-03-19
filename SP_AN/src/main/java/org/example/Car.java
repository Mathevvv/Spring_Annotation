package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Car {
    private String carMark;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;

    @Autowired
    public Car(@Value("${car.carMark}") String carMark, Engine engine, Transmission transmission, Wheel wheel) {
        this.carMark = carMark;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
    }
}
