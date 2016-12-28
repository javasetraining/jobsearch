package ua.pp.iserf.parser.core;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author alex
 */
public abstract class Parser {

    protected String baseUrl;

    protected Document getDocument(String urlOpen) {
        Document doc;
        try {

            doc = Jsoup.connect(urlOpen).get();

            return doc;
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    /**
     * @param baseUrl the baseUrl to set
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    protected ArrayList getAllUrl() {
        ArrayList allPageUrl = new ArrayList();
        Document doc = null;
        doc = getDocument(baseUrl);
        Elements allLinks = doc.select("a.timestamp-link");

        for (Element link : allLinks) {
            allPageUrl.add(link.attr("abs:href"));
        }

        return allPageUrl;
    }

}
