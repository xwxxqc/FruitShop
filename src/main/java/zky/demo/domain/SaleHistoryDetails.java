package zky.demo.domain;

public class SaleHistoryDetails {
    private String saleGoods;
    private Double saleWeight;
    private Double salePrice;
    private Double money;

    public SaleHistoryDetails(String saleGoods, Double saleWeight, Double salePrice, Double money) {
        this.saleGoods = saleGoods;
        this.saleWeight = saleWeight;
        this.salePrice = salePrice;
        this.money = money;
    }

    public SaleHistoryDetails() {
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SaleHistoryDetails{" +
                "saleGoods='" + saleGoods + '\'' +
                ", saleWeight=" + saleWeight +
                ", salePrice=" + salePrice +
                ", money=" + money +
                '}';
    }
}
