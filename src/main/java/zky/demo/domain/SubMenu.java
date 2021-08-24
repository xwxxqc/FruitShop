package zky.demo.domain;

public class SubMenu {
    private Integer id;
    private String menuName;
    private String path;
    private String photo;

    public SubMenu(String menuName, String path, String photo) {
        this.menuName = menuName;
        this.path = path;
        this.photo = photo;
    }

    public SubMenu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "SubMenu{" +
                "id=" + id +
                ", menuName='" + menuName + '\'' +
                ", path='" + path + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
