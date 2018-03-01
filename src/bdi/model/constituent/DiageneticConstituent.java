package bdi.model.constituent;

import bdi.model.modifier.DiageneticModifier;

/**
 * @author Lucas Hagen
 */

public class DiageneticConstituent extends MineralConstituent implements ParageneticRelationConstituent {

    String habit;
    DiageneticModifier modifier;

    private DiageneticConstituent(String name, String location, String constituentSet, String habit, DiageneticModifier modifier) {
        super(name, location, constituentSet);
        this.habit = habit;
        this.modifier = modifier;
    }

    public static DiageneticConstituent fromString(String args) {
        String[] attributes = splitAttributes(args);

        return new DiageneticConstituent(attributes[0],
                attributes[2],
                null,
                attributes[1],
                DiageneticModifier.fromString(attributes[3])
        );
    }

        /*

    [DIAGENETIC] = 7
        0 Constituinte
        1 Habito
        2 Localização Diagenética
        3 Modificação Diagenética
        4 Relação Paragenética
        5 Constituinte da Relação Paragenética
        6 Localização do Constituinte da Relação Paragenética

     */

}
