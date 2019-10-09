package com.db.hackathon.caelimetrix.caelimetrixserver.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tradedata")
public class TradeData implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ric")
    private String ric;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "sector")
    private String sector;

    @Column(name = "client")
    private String client;

    @Column(name = "stock_name")
    private int stockName;

    @Column(name = "product_country")
    private String productCountry;

    @Column(name = "buy_sell")
    private String buySell;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "price")
    private String price;

    @Column(name = "notional")
    private String notional;

    @Column(name = "CSG_Rating")
    private String csgRating;

    @Column(name = "CSG_Score")
    private int csgScore;

    @Column(name = "Carbon_Emissions")
    private String carbonEmissions;

    @Column(name = "GHG_Emission")
    private String ghgEmission;

}
