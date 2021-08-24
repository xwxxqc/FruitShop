package zky.demo.domain.echarts;

public class SaleWeightPercentage {
    private String name;//saleGoods
    private String value;//saleWeight

    public SaleWeightPercentage(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public SaleWeightPercentage() {
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
        return "SaleWeightPercentage{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
