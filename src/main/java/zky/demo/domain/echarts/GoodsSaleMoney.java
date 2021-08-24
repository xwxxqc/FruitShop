package zky.demo.domain.echarts;

public class GoodsSaleMoney {
    private String saleGoods;
    private Double money;

    public GoodsSaleMoney(String saleGoods, Double money) {
        this.saleGoods = saleGoods;
        this.money = money;
    }

    public GoodsSaleMoney() {
    }

    public String getSaleGoods() {
        return saleGoods;
    }

    public void setSaleGoods(String saleGoods) {
        this.saleGoods = saleGoods;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "GoodsSaleMoney{" +
                "saleGoods='" + saleGoods + '\'' +
                ", money=" + money +
                '}';
    }
}
