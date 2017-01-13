
package ua.pp.iserf.parser.core.beans;

/**
 *
 * @author alex
 */
public class Vacancy {
    
    private String title;
    private String description;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    @Override
    public String toString() {
        return "title:" + title + " description:" + description+"\n";

    }
    
}
