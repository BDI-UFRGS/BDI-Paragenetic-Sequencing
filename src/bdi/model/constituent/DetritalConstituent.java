package bdi.model.constituent;

import bdi.model.modifier.DetritalModifier;

/**
 * @author Lucas Hagen
 */

public class DetritalConstituent extends MineralConstituent {

    DetritalModifier modifier;

    private DetritalConstituent(String name, String location, String constituentSet, DetritalModifier modifier) {
        super(name, location, constituentSet);
        this.modifier = modifier;
    }

    public static DetritalConstituent fromString(String args) {
        String[] attributes = splitAttributes(args);

        return new DetritalConstituent(attributes[0],
                attributes[1],
                null,
                DetritalModifier.fromString(attributes[2])
        );
    }

    /*

    [PRIMARY] = 3
        Constituinte Primário
        Localização Primária
        Modificador Primária

     */

}
