package com.db.hackathon.caelimetrix.caelimetrixserver.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tradedata")
public class TradeData implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ric")
    private String ric;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "sector")
    private String sector;

    @Column(name = "client")
    private String client;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "product_country")
    private String productCountry;

    @Column(name = "buy_sell")
    private String buySell;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "notional")
    private double notional;

    @Column(name = "csg_rating")
    private String csgRating;

    @Column(name = "csg_score")
    private int csgScore;

    @Column(name = "carbon_emissions")
    private double carbonEmissions;

    @Column(name = "ghg_emission")
    private double ghgEmission;

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getProductCountry() {
        return productCountry;
    }

    public void setProductCountry(String productCountry) {
        this.productCountry = productCountry;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNotional() {
        return notional;
    }

    public void setNotional(double notional) {
        this.notional = notional;
    }

    public String getCsgRating() {
        return csgRating;
    }

    public void setCsgRating(String csgRating) {
        this.csgRating = csgRating;
    }

    public int getCsgScore() {
        return csgScore;
    }

    public void setCsgScore(int csgScore) {
        this.csgScore = csgScore;
    }

    public double getCarbonEmissions() {
        return carbonEmissions;
    }

    public void setCarbonEmissions(double carbonEmissions) {
        this.carbonEmissions = carbonEmissions;
    }

    public double getGhgEmission() {
        return ghgEmission;
    }

    public void setGhgEmission(double ghgEmission) {
        this.ghgEmission = ghgEmission;
    }

    @Override
    public String toString() {
        return "TradeData{" +
                "ric='" + ric + '\'' +
                ", orderDate=" + orderDate +
                ", sector='" + sector + '\'' +
                ", client='" + client + '\'' +
                ", stockName='" + stockName + '\'' +
                ", productCountry='" + productCountry + '\'' +
                ", buySell='" + buySell + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", notional=" + notional +
                ", csgRating='" + csgRating + '\'' +
                ", csgScore=" + csgScore +
                ", carbonEmissions=" + carbonEmissions +
                ", ghgEmission=" + ghgEmission +
                '}';
    }
}
