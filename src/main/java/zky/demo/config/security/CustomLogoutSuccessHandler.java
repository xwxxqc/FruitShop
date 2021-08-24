package zky.demo.config.security;

import com.google.gson.Gson;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import zky.demo.domain.ResultInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class CustomLogoutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Authentication authentication) throws IOException, ServletException {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(1000);
        resultInfo.setMsg("登出成功！");
        Gson gson = new Gson();
        String json = gson.toJson(resultInfo);
        httpServletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }
}
