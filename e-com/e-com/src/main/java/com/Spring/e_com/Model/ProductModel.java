package com.Spring.e_com.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Ecom")
public class ProductModel {
    @Id
    @JsonProperty("ProductID")
    private int prodId;
    @JsonProperty("ProductName")
    private String prodName;
    @JsonProperty("ProductDescription")
    private String prodDesc;
    @JsonProperty("ProductPrice")
    private BigDecimal prodPrice;
    @JsonProperty("ProductCategory")
    private String prodCat;
    @JsonProperty("ProductDate")
    private Date prodDate;
    @JsonProperty("ProductAvailable")
    private boolean prodAvail;
    @JsonProperty("ProductQuantity")
    private int prodQuantity;

    public ProductModel() {
    }

    public ProductModel(int prodId, String prodName, String prodDesc, BigDecimal prodPrice, String prodCat, Date prodDate, boolean prodAvail, int prodQuantity) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodPrice = prodPrice;
        this.prodCat = prodCat;
        this.prodDate = prodDate;
        this.prodAvail = prodAvail;
        this.prodQuantity = prodQuantity;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public BigDecimal getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdCat() {
        return prodCat;
    }

    public void setProdCat(String prodCat) {
        this.prodCat = prodCat;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public boolean isProdAvail() {
        return prodAvail;
    }

    public void setProdAvail(boolean prodAvail) {
        this.prodAvail = prodAvail;
    }

    public int getProdQuantity() {
        return prodQuantity;
    }

    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }
}
