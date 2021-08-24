package zky.demo.domain.echarts;

public class GoodsInventory {
    private String name;
    private Integer remaining;

    public GoodsInventory(String name, Integer remaining) {
        this.name = name;
        this.remaining = remaining;
    }

    public GoodsInventory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    @Override
    public String toString() {
        return "GoodsInventory{" +
                "name='" + name + '\'' +
                ", remaining=" + remaining +
                '}';
    }
}
