package ua.pp.iserf.parser.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class JobParserMultithread extends Parser {

    private static JobParserMultithread _instance = null;

    public static synchronized JobParserMultithread getInstance() {
        if (_instance == null) {
            _instance = new JobParserMultithread();
        }
        return _instance;
    }

    private JobParserMultithread() {

    }

    public void run() {
        List allPageUrl = getAllUrl();
        List allVacancy = new ArrayList();
        SingleVacancyParser singleVacancyParser = new SingleVacancyParser();
        List threadList = new ArrayList();

        for (Iterator it = allPageUrl.iterator(); it.hasNext();) {
            String url = (String) it.next();

            Thread thread = new Thread(new SingleVacancyParserMultithread(url, allVacancy));
            thread.start();
            threadList.add(thread);

        }

        for (Iterator it = threadList.iterator(); it.hasNext();) {
            Thread thread = (Thread) it.next();
            try {
                thread.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(JobParserMultithread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
