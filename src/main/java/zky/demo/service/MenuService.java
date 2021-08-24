package zky.demo.service;

import zky.demo.domain.MainMenu;

import java.util.List;

public interface MenuService {

    public List<MainMenu> queryMenuByAuth(String auth);

}
