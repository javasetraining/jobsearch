package ua.pp.iserf.parser.core;

import ua.pp.iserf.parser.core.beans.Vacancy;
import java.util.List;
import org.jsoup.nodes.Document;

/**
 *
 * @author alex
 */
public class SingleVacancyParserMultithread extends Parser implements Runnable {
    
    private String baseUrl;
    private List allVacancy;


    public   SingleVacancyParserMultithread(String baseUrl, List allVacancy) {
        this.setBaseUrl(baseUrl);
        this.allVacancy = allVacancy;
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
    
    @Override
    public void run() {
        
        Vacancy vacancy = new Vacancy();
        Document doc = getDocument(getBaseUrl());
        vacancy.setTitle(doc.select(".entry-content h1").text());
        vacancy.setDescription(doc.select(".entry-content p.description").text());
        
        allVacancy.add(vacancy);
        System.out.println(vacancy.toString()); 
        
    }
    
}
