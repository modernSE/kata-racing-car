package tddmicroexercises.textconvertor;

import java.util.stream.Stream;

/**
 * Created by Ferdinand.Szekeresch on 05.07.2017.
 */
public interface PlainTextLinesProvider {
    Stream<String> getLines();
}
