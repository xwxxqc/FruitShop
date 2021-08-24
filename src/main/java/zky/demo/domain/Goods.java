package zky.demo.domain;

public class Goods {
    private int id;
    private String name;
    private String remaining;
    private Double price;
    private Double cost;

    public Goods(String name, String remaining, Double price, Double cost) {
        this.name = name;
        this.remaining = remaining;
        this.price = price;
        this.cost = cost;
    }

    public Goods() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemaining() {
        return remaining;
    }

    public void setRemaining(String remaining) {
        this.remaining = remaining;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remaining='" + remaining + '\'' +
                ", price=" + price +
                ", cost=" + cost +
                '}';
    }
}
