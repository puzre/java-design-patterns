package org.puzre.creational.builder.v2.director;

import org.puzre.creational.builder.v2.builder.PlantBuilder;
import org.puzre.creational.builder.v2.component.*;

public class PlantDirector {

    public void constructRosePlant(PlantBuilder builder) {
        builder.name(PlantName.ROSE);
        builder.root(PlantRoot.STRONG);
        builder.stem(PlantStem.THICK);
        builder.leaf(PlantLeaf.WAXY);
        builder.waterSource(PlantWaterSource.RAIN_OR_SOIL);
        builder.habitat(PlantHabitat.TERRESTRIAL);
    }

    public void constructLotusPlant(PlantBuilder builder) {
        builder.name(PlantName.LOTUS);
        builder.root(PlantRoot.WEAK);
        builder.stem(PlantStem.SOFT);
        builder.leaf(PlantLeaf.THIN);
        builder.waterSource(PlantWaterSource.SURROUNDING_WATER);
        builder.habitat(PlantHabitat.AQUATIC);
    }

}
