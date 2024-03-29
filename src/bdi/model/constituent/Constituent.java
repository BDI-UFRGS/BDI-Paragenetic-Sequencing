package bdi.model.constituent;

import bdi.model.loader.csv.DataLoaderPattern;

/**
 * @author Lucas Hagen
 */

public abstract class Constituent {

    String name;
    String location;
    String constituentSet;

    protected Constituent(String name, String location, String constituentSet) {
        this.name = name;
        this.location = location;
        this.constituentSet = constituentSet;
    }

    protected static String[] splitAttributes(String line) {
        String[] result = line.split(DataLoaderPattern.SPLITTER);

/*        System.out.println("'" + line + "'");
        for(String a : result)
            System.out.println("\t'" + a + "'");*/

        return result;
    }

    public static Constituent fromString(String args) {
        String[] attributes = splitAttributes(args);
        Constituent toReturn = null;

        switch (attributes.length) {
            case 3:
                toReturn = DetritalConstituent.fromString(args);
                break;
            case 7:
                toReturn = DiageneticConstituent.fromString(args);
                break;
            case 6:
                toReturn = MacroporosityConstituent.fromString(args);
                break;
        }

        return toReturn;
    }

}
