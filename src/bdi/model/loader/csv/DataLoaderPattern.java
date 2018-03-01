package bdi.model.loader.csv;

/**
 * @author Lucas Hagen
 */

public class DataLoaderPattern {

    public static String HEADER_TAG = "[HEADER]";
    public static String PRIMARY_CONTITUENT_TAG = "[PRIMARY]";
    public static String DIAGENETIC_CONTITUENT_TAG = "[DIAGENETIC]";
    public static String POROSITY_CONTITUENT_TAG = "[POROSITY]";
    public static String SPLITTER = "( ?- )|( - ?)" /*"(?<= )-(?= )"*/;

    /*

    [PRIMARY] = 3
        Constituinte Primário
        Localização Primária
        Modificador Primária

    [DIAGENETIC] = 7
        Constituinte
        Habito
        Localização Diagenética
        Modificação Diagenética
        Relação Paragenética
        Constituinte da Relação Paragenética
        Localização do Constituinte da Relação Paragenética

    [POROSITY] = 6
        Porosidade
        Localização da Porosidade
        Modificador da Porosidade
        Relação Paragenética
        Constituintes da Relação Paragenética
        Localização dos Constituintes da Relação Paragenética

     */

}
