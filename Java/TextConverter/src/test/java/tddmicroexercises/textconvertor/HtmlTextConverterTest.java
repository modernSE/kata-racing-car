package tddmicroexercises.textconvertor;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.stream.Stream;

public class HtmlTextConverterTest {
    @Test
    public void foo() {
        PlainTextLinesProvider plainTextLinesProviderMock = new PlainTextLinesProvider() {
            @Override
            public Stream<String> getLines() {
                return Stream.of("foo");
            }
        };

        HtmlTextConverter converter = new HtmlTextConverter(plainTextLinesProviderMock);
        assertEquals("foo<br />", converter.convertToHtml());
    }
}
