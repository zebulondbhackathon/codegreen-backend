package com.db.hackathon.caelimetrix.caelimetrixserver.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ticker")
public class Ticker implements Serializable {

    @Id
    @Column(name = "source")
    private String source;

    @Column(name = "news_header")
    private String newsHeader;

    @Column(name = "news_details")
    private String newsDetails;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getNewsHeader() {
        return newsHeader;
    }

    public void setNewsHeader(String newsHeader) {
        this.newsHeader = newsHeader;
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "source='" + source + '\'' +
                ", newsHeader='" + newsHeader + '\'' +
                ", newsDetails='" + newsDetails + '\'' +
                '}';
    }
}
