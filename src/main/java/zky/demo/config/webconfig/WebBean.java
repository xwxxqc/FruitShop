package zky.demo.config.webconfig;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class WebBean {

    @Bean
    public Gson gson(){
        return new Gson();
    }

    @Bean
    public Map map(){
        return new HashMap<String,Object>();
    }

}
