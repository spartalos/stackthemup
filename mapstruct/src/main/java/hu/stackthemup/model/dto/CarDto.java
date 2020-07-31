package hu.stackthemup.model.dto;

import hu.stackthemup.model.enums.CarType;
import lombok.Data;

@Data
public class CarDto {
    private String name;
    private CarType type;
    private int wheels;
    private int numOfSeats;
}
