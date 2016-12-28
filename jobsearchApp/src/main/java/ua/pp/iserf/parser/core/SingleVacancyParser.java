package ua.pp.iserf.parser.core;

import ua.pp.iserf.parser.core.beans.Vacancy;
import org.jsoup.nodes.Document;

/**
 *
 * @author alex
 */
public class SingleVacancyParser extends Parser {

    private String baseUrl;
    
    public void SingleVacancyParser() {

    }
    
    public void SingleVacancyParser(String baseUrl) {
        this.setBaseUrl(baseUrl);
    }

    public Vacancy getVacancy() {
        Vacancy vacancy = new Vacancy();
        Document doc = getDocument(getBaseUrl());
        vacancy.setTitle(doc.select(".entry-content h1").text());
        vacancy.setDescription(doc.select(".entry-content p.description").text());

        return vacancy;
    }

    /**
     * @return the baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * @param baseUrl the baseUrl to set
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

}
