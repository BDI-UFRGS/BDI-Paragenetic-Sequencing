package bdi.model.loader.csv;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucas Hagen
 */

public class Well {

    String name;

    List<WellSection> sections;

    public Well(String name) {
        this.name = name;
        sections = new ArrayList<>();
    }

    public void addSection() {

    }



}
