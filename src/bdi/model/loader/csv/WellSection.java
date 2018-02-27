package bdi.model.loader.csv;

import bdi.model.constituent.Constituent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucas Hagen
 */

public class WellSection {

    private final String wellName;
    private final Double depth;
    private final Double startDepth;
    private final String thinSection;

    private final List<Constituent> constituents;

    public WellSection(String wellName, Double depth, Double startDepth, String thinSection) {
        this.wellName = wellName;
        this.depth = depth;
        this.startDepth = startDepth;
        this.thinSection = thinSection;

        this.constituents = new ArrayList<>();
    }

    public String getWellName() {
        return wellName;
    }

    public Double getDepth() {
        return depth;
    }

    public Double getStartDepth() {
        return startDepth;
    }

    public String getThinSection() {
        return thinSection;
    }

    public List<Constituent> getConstituents() {
        return constituents;
    }

    public void addConstituent(Constituent constituent) {
        this.constituents.add(constituent);
    }
}
