package zky.demo.config.security;

import com.google.gson.Gson;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import zky.demo.domain.ResultInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        AuthenticationException e) throws IOException, ServletException {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(1001);
        resultInfo.setMsg("ERROR");
        Gson gson = new Gson();
        String s = gson.toJson(resultInfo);
        PrintWriter writer = httpServletResponse.getWriter();
        writer.println(s);
        writer.flush();
        writer.close();
    }
}
