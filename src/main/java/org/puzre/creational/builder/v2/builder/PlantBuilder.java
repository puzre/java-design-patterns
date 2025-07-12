package org.puzre.creational.builder.v2.builder;

import org.puzre.creational.builder.v2.component.*;

public interface PlantBuilder {

    void name(PlantName name);
    void root(PlantRoot root);
    void stem(PlantStem stem);
    void leaf(PlantLeaf leaf);
    void waterSource(PlantWaterSource waterSource);
    void habitat(PlantHabitat habitat);

}
