package zky.demo.domain.echarts;

public class TimeAndWeight {
    private String name;//time
    private int value;//weight

    public TimeAndWeight(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public TimeAndWeight() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TimeAndWeight{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
