package zky.demo.domain;

import java.sql.Timestamp;

public class IntoRecord {
    private Integer id;
    private Timestamp time;
    private String name;
    private Double weight;
    private String handler;

    public IntoRecord(Timestamp time, String name, Double weight, String handler) {
        this.time = time;
        this.name = name;
        this.weight = weight;
        this.handler = handler;
    }

    public IntoRecord() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    @Override
    public String toString() {
        return "IntoRecord{" +
                "id=" + id +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", handler='" + handler + '\'' +
                '}';
    }
}
