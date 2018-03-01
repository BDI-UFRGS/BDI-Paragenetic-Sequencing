package bdi.model.loader.csv;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lucas Hagen
 */

public class DataLoader {

    Well well;

    private CSVReader openFile(String fileName) throws FileNotFoundException {
        CSVReader reader = new CSVReader(new FileReader(fileName), ';');
        return reader;
    }

    public void loadWells(String fileName) throws IOException {
        CSVReader reader = openFile(fileName);

        int sections = initializeRead(reader);

        //while()
    }

    public int initializeRead(CSVReader reader) throws IOException {
        String[] line = reader.readNext();

        if(line[0].equalsIgnoreCase(DataLoaderPattern.HEADER_TAG)) {
            this.well = new Well(line[2]);
        } else {
            return 0;
        }

        return line.length - 2;
    }


}
