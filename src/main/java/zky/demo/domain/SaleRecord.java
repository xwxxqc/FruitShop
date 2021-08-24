package zky.demo.domain;

import java.util.Date;

public class SaleRecord {
    private int id;
    private Date saleTime;
    private String saleGoods;
    private Double saleWeight;
    private Double salePrice;
    private String salePerson;
    private Double money;

    public SaleRecord(Date saleTime, String saleGoods, Double saleWeight, Double salePrice, String salePerson, Double money) {
        this.saleTime = saleTime;
        this.saleGoods = saleGoods;
        this.saleWeight = saleWeight;
        this.salePrice = salePrice;
        this.salePerson = salePerson;
        this.money = money;
    }

    public SaleRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public String getSaleGoods() {
        return saleGoods;
    }

    public void setSaleGoods(String saleGoods) {
        this.saleGoods = saleGoods;
    }

    public Double getSaleWeight() {
        return saleWeight;
    }

    public void setSaleWeight(Double saleWeight) {
        this.saleWeight = saleWeight;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getSalePerson() {
        return salePerson;
    }

    public void setSalePerson(String salePerson) {
        this.salePerson = salePerson;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SaleRecord{" +
                "id=" + id +
                ", saleTime=" + saleTime +
                ", saleGoods='" + saleGoods + '\'' +
                ", saleWeight=" + saleWeight +
                ", salePrice=" + salePrice +
                ", salePerson='" + salePerson + '\'' +
                ", money=" + money +
                '}';
    }
}
