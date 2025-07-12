package org.puzre.creational.builder.v2.builder;

import org.puzre.creational.builder.v2.component.*;
import org.puzre.creational.builder.v2.plant.TerrestrialPlant;

public class TerrestrialPlantBuilder implements PlantBuilder{

    private PlantName name;
    private PlantRoot root;
    private PlantStem stem;
    private PlantLeaf leaf;
    private PlantWaterSource waterSource;
    private PlantHabitat habitat;

    @Override
    public void name(PlantName name) {
        this.name = name;
    }

    @Override
    public void root(PlantRoot root) {
        this.root = root;
    }

    @Override
    public void stem(PlantStem stem) {
        this.stem = stem;
    }

    @Override
    public void leaf(PlantLeaf leaf) {
        this.leaf = leaf;
    }

    @Override
    public void waterSource(PlantWaterSource waterSource) {
        this.waterSource = waterSource;
    }

    @Override
    public void habitat(PlantHabitat habitat) {
        this.habitat = habitat;
    }

    public TerrestrialPlant getProduct() {
        return new TerrestrialPlant(this.name, this.root, this.stem, this.leaf, this.waterSource, this.habitat);
    }

}
