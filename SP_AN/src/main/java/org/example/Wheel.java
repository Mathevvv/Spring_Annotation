package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
public class Wheel {
    private int amountOfWheels;

    public Wheel(@Value("${wheel.amountOfWheels}") int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }
}
