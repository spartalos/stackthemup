package hu.stackthemup.model.mapper;

import hu.stackthemup.model.Car;
import hu.stackthemup.model.dto.CarDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-31T17:00:41+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto toDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setNumOfSeats( car.getSeats() );
        carDto.setName( car.getBrand() );
        carDto.setType( car.getType() );
        carDto.setWheels( car.getWheels() );

        return carDto;
    }
}
