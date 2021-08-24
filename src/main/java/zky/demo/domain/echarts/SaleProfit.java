package zky.demo.domain.echarts;

public class SaleProfit {
    private String value;
    private String name;

    public SaleProfit(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public SaleProfit() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SaleProfit{" +
                "value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
