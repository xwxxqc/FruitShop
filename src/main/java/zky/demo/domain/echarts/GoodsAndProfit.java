package zky.demo.domain.echarts;

public class GoodsAndProfit {
    private String name;
    private String value;

    public GoodsAndProfit(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public GoodsAndProfit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GoodsAndProfit{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
