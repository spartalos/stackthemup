package hu.stackthemup;

import hu.stackthemup.model.Car;
import hu.stackthemup.model.dto.CarDto;
import hu.stackthemup.model.enums.CarType;
import hu.stackthemup.model.mapper.CarMapper;

public class Main {

    public static void main(String[] args){
        final Car car = Car.builder()
            .brand("Volvo")
            .licenceNumber("ELB-456")
            .seats(5)
            .type(CarType.SEDAN)
            .vin("1G6ET1296YU171065")
            .wheels(4)
            .build();

        final CarDto dto = CarMapper.INSTANCE.toDto(car);
        System.out.println(dto);
    }

}
