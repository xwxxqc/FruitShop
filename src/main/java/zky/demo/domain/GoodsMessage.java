package zky.demo.domain;

public class GoodsMessage {
    private String saleGoods;
    private String saleWeight;
    private Double salePrice;
    private Double cost;
    private String repository;

    public GoodsMessage(String saleGoods, String saleWeight, Double salePrice, Double cost, String repository) {
        this.saleGoods = saleGoods;
        this.saleWeight = saleWeight;
        this.salePrice = salePrice;
        this.cost = cost;
        this.repository = repository;
    }

    public GoodsMessage() {
    }

    public String getSaleGoods() {
        return saleGoods;
    }

    public void setSaleGoods(String saleGoods) {
        this.saleGoods = saleGoods;
    }

    public String getSaleWeight() {
        return saleWeight;
    }

    public void setSaleWeight(String saleWeight) {
        this.saleWeight = saleWeight;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    @Override
    public String toString() {
        return "GoodsMessage{" +
                "saleGoods='" + saleGoods + '\'' +
                ", saleWeight='" + saleWeight + '\'' +
                ", salePrice=" + salePrice +
                ", cost=" + cost +
                ", repository='" + repository + '\'' +
                '}';
    }
}
