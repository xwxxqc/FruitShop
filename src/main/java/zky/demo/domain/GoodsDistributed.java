package zky.demo.domain;

public class GoodsDistributed {
    private String name;
    private Integer remaining;
    private String repository;
    private String address;

    public GoodsDistributed(String name, Integer remaining, String repository, String address) {
        this.name = name;
        this.remaining = remaining;
        this.repository = repository;
        this.address = address;
    }

    public GoodsDistributed() {
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

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "name='" + name + '\'' +
                ", remaining=" + remaining +
                ", repository='" + repository + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
