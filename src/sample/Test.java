package sample;

import bdi.model.constituent.Constituent;
import bdi.model.constituent.DetritalConstituent;
import bdi.model.constituent.DiageneticConstituent;
import bdi.model.constituent.MacroporosityConstituent;

/**
 * @author Lucas Hagen
 */

public class Test {

    public static void main(String args[]) {
/*        Scanner scanner = new Scanner(System.in);
        String line;

        while((line = scanner.next()) != null) {
            printType(Constituent.fromString(line));
        }*/

        printType(Constituent.fromString("Biotite - As monomineralic grain - "));
    }

    public static void printType(Constituent constituent) {
        if(constituent instanceof DetritalConstituent)
            System.out.println("DETRITAL");
        else if(constituent instanceof DiageneticConstituent)
            System.out.println("DIAGENETIC");
        else if(constituent instanceof MacroporosityConstituent)
            System.out.println("MACROPOROSITY");
        else if(constituent == null)
            System.out.println("NULL");
        else
            System.out.println("NONE");
    }

}
