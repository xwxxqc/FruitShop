package zky.demo.domain;

public class RepositoryAdmin {
    private Integer id;
    private String name;
    private String repository;
    private String telephone;
    private boolean isWork;

    public RepositoryAdmin(String name, String repository, String telephone, boolean isWork) {
        this.name = name;
        this.repository = repository;
        this.telephone = telephone;
        this.isWork = isWork;
    }

    public RepositoryAdmin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    @Override
    public String toString() {
        return "RepositoryAdmin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", repository='" + repository + '\'' +
                ", telephone='" + telephone + '\'' +
                ", isWork=" + isWork +
                '}';
    }
}
