package org.example;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class Transmission {
    private int maxTransmission;
    private String transmissionMark;
}
