package zky.demo.domain;

import java.util.List;

public class MainMenu {
    private Integer id;
    private String menuName;
    private String path;
    private String photo;
    private List<SubMenu> subMenus;

    public MainMenu(String menuName, String path, String photo, List<SubMenu> subMenus) {
        this.menuName = menuName;
        this.path = path;
        this.photo = photo;
        this.subMenus = subMenus;
    }

    public MainMenu() {
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

    public List<SubMenu> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<SubMenu> subMenus) {
        this.subMenus = subMenus;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", menuName='" + menuName + '\'' +
                ", path='" + path + '\'' +
                ", photo='" + photo + '\'' +
                ", subMenus=" + subMenus +
                '}';
    }
}
