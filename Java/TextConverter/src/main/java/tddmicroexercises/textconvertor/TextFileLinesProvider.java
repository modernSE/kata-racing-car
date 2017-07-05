package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

/**
 * Created by Ferdinand.Szekeresch on 05.07.2017.
 */
public class TextFileLinesProvider implements PlainTextLinesProvider{

    private final String fileName;

    public TextFileLinesProvider(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Stream<String> getLines() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            return reader.lines();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
