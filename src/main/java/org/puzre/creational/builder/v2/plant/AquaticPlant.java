package org.puzre.creational.builder.v2.plant;

import org.puzre.creational.builder.v2.component.*;

public class AquaticPlant {

    private final PlantName name;
    private final PlantRoot root;
    private final PlantStem stem;
    private final PlantLeaf leaf;
    private final PlantWaterSource waterSource;
    private final PlantHabitat habitat;

    public AquaticPlant(PlantName name,
                        PlantRoot root,
                        PlantStem stem,
                        PlantLeaf leaf,
                        PlantWaterSource waterSource,
                        PlantHabitat habitat) {
        this.name = name;
        this.root = root;
        this.stem = stem;
        this.leaf = leaf;
        this.waterSource = waterSource;
        this.habitat = habitat;
    }

    public PlantHabitat getHabitat() {
        return this.habitat;
    }

    @Override
    public String toString() {
        return "🌊 Aquatic Plant\n" +
                "Name: " + (name != null ? name : "Unknown") + "\n" +
                "Root: " + (root != null ? root : "Unknown") + "\n" +
                "Stem: " + (stem != null ? stem : "Unknown") + "\n" +
                "Leaf: " + (leaf != null ? leaf : "Unknown") + "\n" +
                "Water Source: " + (waterSource != null ? waterSource : "Unknown") + "\n" +
                "Habitat: " + habitat;
    }

}
