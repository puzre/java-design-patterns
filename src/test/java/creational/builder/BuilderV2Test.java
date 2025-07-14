package creational.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.puzre.creational.builder.v2.builder.AquaticPlantBuilder;
import org.puzre.creational.builder.v2.builder.TerrestrialPlantBuilder;
import org.puzre.creational.builder.v2.component.PlantHabitat;
import org.puzre.creational.builder.v2.director.PlantDirector;
import org.puzre.creational.builder.v2.plant.AquaticPlant;
import org.puzre.creational.builder.v2.plant.TerrestrialPlant;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderV2Test {

    @Test
    @DisplayName("Aquatic Plant Builder Test")
    public void aquaticPlantBuilderTest() {

        PlantDirector director = new PlantDirector();
        AquaticPlantBuilder builder = new AquaticPlantBuilder();

        director.constructLotusPlant(builder);

        AquaticPlant lotusPlant = builder.getProduct();

        System.out.println(lotusPlant.toString());

        PlantHabitat expectedPlantHabitat = PlantHabitat.AQUATIC;
        PlantHabitat actualPlantHabitat = lotusPlant.getHabitat();

        assertEquals(expectedPlantHabitat, actualPlantHabitat);

    }

    @Test
    @DisplayName("Terrestrial Plant Builder Test")
    public void terrestrialPlantBuilderTest() {

        PlantDirector director = new PlantDirector();
        TerrestrialPlantBuilder builder = new TerrestrialPlantBuilder();

        director.constructRosePlant(builder);

        TerrestrialPlant rosePlant = builder.getProduct();

        System.out.println(rosePlant.toString());

        PlantHabitat expectedPlantHabitat = PlantHabitat.TERRESTRIAL;
        PlantHabitat actualPlantHabitat = rosePlant.getHabitat();

        assertEquals(expectedPlantHabitat, actualPlantHabitat);

    }

}
