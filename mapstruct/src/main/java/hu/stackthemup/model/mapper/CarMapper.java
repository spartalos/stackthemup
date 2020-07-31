package hu.stackthemup.model.mapper;

import hu.stackthemup.model.Car;
import hu.stackthemup.model.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "brand", target = "name")
    @Mapping(source = "seats", target = "numOfSeats")
    CarDto toDto(Car car);
}
