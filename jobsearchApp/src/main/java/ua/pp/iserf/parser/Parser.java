
package ua.pp.iserf.parser;

import ua.pp.iserf.parser.core.JobParser;
import ua.pp.iserf.parser.core.JobParserMultithread;

/**
 *
 * @author alex
 */
public class Parser {
    
    
    
        public static void main(String[] args) {
         
        System.out.println("Parser start point");
        
                 
       JobParser  jobParser = JobParser.getInstance();
        jobParser.setBaseUrl("http://javajobsearchapp.blogspot.com/");
        jobParser.run();
        
        
//        JobParserMultithread  jobParser = JobParserMultithread.getInstance();
//        jobParser.setBaseUrl("http://javajobsearchapp.blogspot.com/");
//        jobParser.run();

    }
}
