package ua.pp.iserf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parser_id")
    private Long parserId;
    @Column(name = "parser_name", nullable = false)
    private String parserName;
    @Column(name = "url", nullable = false)
    private String url;
    @Column(name = "status", nullable = false)
    private String status;

    public Parser() {
    }

    /**
     * @return the parserId
     */
    public Long getParserId() {
        return parserId;
    }

    /**
     * @param parserId the parserId to set
     */
    public void setParserId(Long parserId) {
        this.parserId = parserId;
    }

    /**
     * @return the parserName
     */
    public String getParserName() {
        return parserName;
    }

    /**
     * @param parserName the parserName to set
     */
    public void setParserName(String parserName) {
        this.parserName = parserName;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    
}


