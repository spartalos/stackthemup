package hu.stackthemup.model;

import hu.stackthemup.model.enums.CarType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String brand;
    private String vin;
    private String licenceNumber;
    private CarType type;
    private int wheels;
    private int seats;
}
