package zky.demo.domain;

public class Customer {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String email;
    private String telephone;

    public Customer(String name, String sex, String telephone) {
        this.name = name;
        this.sex = sex;
        this.telephone = telephone;
    }

    public Customer(String name, String sex, int age, String email, String telephone) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
    }

    public Customer() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
