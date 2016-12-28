package ua.pp.iserf.parser.core;

import ua.pp.iserf.parser.core.beans.Vacancy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alex
 */
public class JobParser extends Parser {

    private static JobParser _instance = null;

    public static synchronized JobParser getInstance() {
        if (_instance == null) {
            _instance = new JobParser();
        }
        return _instance;
    }

    private JobParser() {

    }

    public void run() {
        List allPageUrl = getAllUrl();
        // for test
        System.out.println(java.util.Arrays.deepToString(allPageUrl.toArray()));
        
        SingleVacancyParser singleVacancyParser = new SingleVacancyParser();

        for (Iterator it = allPageUrl.iterator(); it.hasNext();) {
            String url = (String) it.next();
            singleVacancyParser.setBaseUrl(url);
            Vacancy vacancy = singleVacancyParser.getVacancy();
            System.out.println(vacancy.toString());
        }

    }

}
