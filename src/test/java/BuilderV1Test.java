import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.puzre.creational.builder.v1.House;
import org.puzre.creational.builder.v1.Plant;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderV1Test {

    @Test
    @DisplayName("Plant Builder Test")
    public void plantBuilderTest() {

        Plant plant = Plant.builder()
                .color("Green")
                .fruits(2)
                .leafs(2)
                .nodes(2)
                .build();

        System.out.println(plant.toString());

        String expectedColor = "Green";
        String actualColor = plant.getColor();

        assertEquals(expectedColor, actualColor);

    }

    @Test
    @DisplayName("House Builder Test")
    public void houseBuilderTest() {

        House house = House.builder()
                .color("Blue")
                .doors(2)
                .windows(4)
                .build();

        System.out.println(house.toString());

        String expectedColor = "Blue";
        String actualColor = house.getColor();

        assertEquals(expectedColor, actualColor);

    }

}
