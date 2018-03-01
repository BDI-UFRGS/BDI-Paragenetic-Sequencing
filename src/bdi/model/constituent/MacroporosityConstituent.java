package bdi.model.constituent;

import bdi.model.modifier.MacroporosityModifier;

/**
 * @author Lucas Hagen
 */

public class MacroporosityConstituent extends Constituent implements ParageneticRelationConstituent {

    MacroporosityModifier modifier;

    private MacroporosityConstituent(String name, String location, String constituentSet, MacroporosityModifier modifier) {
        super(name, location, constituentSet);
        this.modifier = modifier;
    }

    public static MacroporosityConstituent fromString(String args) {
        String[] attributes = splitAttributes(args);

        return new MacroporosityConstituent(attributes[0],
                attributes[1],
                null,
                MacroporosityModifier.fromString(attributes[2])
        );
    }

    /*

    [POROSITY] = 6
        0 Porosidade
        1 Localização da Porosidade
        2 Modificador da Porosidade
        3 Relação Paragenética
        4 Constituintes da Relação Paragenética
        5 Localização dos Constituintes da Relação Paragenética

     */
}
