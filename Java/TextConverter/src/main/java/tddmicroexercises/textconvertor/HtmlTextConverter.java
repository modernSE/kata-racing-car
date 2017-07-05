package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class HtmlTextConverter {

    private final PlainTextLinesProvider linesProvider;

    public HtmlTextConverter(final PlainTextLinesProvider linesProvider) {
        this.linesProvider = linesProvider;
    }

    public String convertToHtml() {

        StringBuffer htmlBuffer = new StringBuffer();
        linesProvider.getLines().map(this::convertLine).forEach(htmlBuffer::append);
        return htmlBuffer.toString();

    }

    private String convertLine(String plainLine) {
        return StringEscapeUtils.escapeHtml(plainLine) + "<br />";
    }

}
