package zky.demo.domain;

public class Debt {
    private String goodsName;
    private String withCustomer;
    private String telephone;
    private Double money;

    public Debt(String goodsName, String withCustomer, String telephone, Double money) {
        this.goodsName = goodsName;
        this.withCustomer = withCustomer;
        this.telephone = telephone;
        this.money = money;
    }

    public Debt() {
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getWithCustomer() {
        return withCustomer;
    }

    public void setWithCustomer(String withCustomer) {
        this.withCustomer = withCustomer;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Debt{" +
                "goodsName='" + goodsName + '\'' +
                ", withCustomer='" + withCustomer + '\'' +
                ", telephone='" + telephone + '\'' +
                ", money=" + money +
                '}';
    }
}
