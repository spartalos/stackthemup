package hu.stackthemup.model.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import hu.stackthemup.model.Car;
import hu.stackthemup.model.dto.CarDto;
import hu.stackthemup.model.enums.CarType;
import org.junit.Test;

public class CarMapperTest {

    @Test
    public void test_toDto() {
        final Car car = Car.builder()
            .brand("Volvo")
            .licenceNumber("ELB-456")
            .seats(5)
            .type(CarType.SEDAN)
            .vin("1G6ET1296YU171065")
            .wheels(4)
            .build();

        final CarDto dto = CarMapper.INSTANCE.toDto(car);
        assertNotNull(dto);
        assertEquals(dto.getName(), car.getBrand());
        assertEquals(dto.getNumOfSeats(), car.getSeats());
        assertEquals(dto.getType(), car.getType());
        assertEquals(dto.getWheels(), car.getWheels());
    }
}