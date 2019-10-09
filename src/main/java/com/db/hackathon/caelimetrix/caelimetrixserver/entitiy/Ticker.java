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

    @Override
    public String toString() {
        return "Ticker{" +
                "source='" + source + '\'' +
                ", newsHeader='" + newsHeader + '\'' +
                ", newsDetails='" + newsDetails + '\'' +
                '}';
    }
}
