package org.example;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
public class Transmission {
    private int maxTransmission;
    private String transmissionMark;

    public Transmission(@Value("${transmission.maxTransmission}") int maxTransmission,
                        @Value("${transmission.transmissionMark}") String transmissionMark) {
        this.maxTransmission = maxTransmission;
        this.transmissionMark = transmissionMark;
    }
}
