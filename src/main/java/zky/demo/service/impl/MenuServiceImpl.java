package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.MenuDao;
import zky.demo.domain.MainMenu;
import zky.demo.service.MenuService;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<MainMenu> queryMenuByAuth(String auth) {
        List<MainMenu> mainMenus = menuDao.queryMenuByAuth(auth);
        return mainMenus;
    }
}
