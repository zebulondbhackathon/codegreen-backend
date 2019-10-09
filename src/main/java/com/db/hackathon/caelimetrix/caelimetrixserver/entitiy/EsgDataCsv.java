package com.db.hackathon.caelimetrix.caelimetrixserver.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "esgdatacsv")
public class EsgDataCsv implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String ric;

    @Column(name = "Company Name")
    private String companyName;

    private String sector;

    @Column(name = "CSG_Rating")
    private String csgRating;

    @Column(name = "CSG_Score")
    private int csgScore;

    @Column(name = "Carbon_Emissions")
    private String carbonEmissions;

    @Column(name = "GHG_Emission")
    private String ghgEmission;

    public EsgDataCsv() {
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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

    public String getCarbonEmissions() {
        return carbonEmissions;
    }

    public void setCarbonEmissions(String carbonEmissions) {
        this.carbonEmissions = carbonEmissions;
    }

    public String getGhgEmission() {
        return ghgEmission;
    }

    public void setGhgEmission(String ghgEmission) {
        this.ghgEmission = ghgEmission;
    }

    @Override
    public String toString() {
        return "EsgDataCsv{" +
                "ric='" + ric + '\'' +
                ", companyName='" + companyName + '\'' +
                ", sector='" + sector + '\'' +
                ", csgRating='" + csgRating + '\'' +
                ", csgScore=" + csgScore +
                ", carbonEmissions='" + carbonEmissions + '\'' +
                ", ghgEmission='" + ghgEmission + '\'' +
                '}';
    }
}
