package zky.demo.domain;


import java.util.Date;

public class CustomerHistory {
    private int id;
    private Date createTime;
    private String goodsName;
    private Double goodsPrice;
    private String withCustomer;
    private boolean isPay;

    public CustomerHistory(Date createTime, String goodsName, Double goodsPrice, String withCustomer, boolean isPay) {
        this.createTime = createTime;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.withCustomer = withCustomer;
        this.isPay = isPay;
    }

    public CustomerHistory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getWithCustomer() {
        return withCustomer;
    }

    public void setWithCustomer(String withCustomer) {
        this.withCustomer = withCustomer;
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }

    @Override
    public String toString() {
        return "CustomerHistory{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", withCustomer='" + withCustomer + '\'' +
                ", isPay=" + isPay +
                '}';
    }
}
