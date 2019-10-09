package com.db.hackathon.caelimetrix.caelimetrixserver.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "holdings")
public class Holdings implements Serializable {

    @Id
    @Column(name = "client")
    private String client;

    @Column(name = "stock_name")
    private String stock_name;

    @Column(name = "notional")
    private Double notional;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public Double getNotional() {
        return notional;
    }

    public void setNotional(Double notional) {
        this.notional = notional;
    }

    @Override
    public String toString() {
        return "Holdings{" +
                "client='" + client + '\'' +
                ", stock_name='" + stock_name + '\'' +
                ", notional=" + notional +
                '}';
    }
}
