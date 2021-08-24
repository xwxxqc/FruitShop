package zky.demo.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtils {

    public static String SALT="H^G%G#G@JH*H&";

    public static String getToken(Map<String,String> map){
        JWTCreator.Builder builder = JWT.create();
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7);
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        builder.withExpiresAt(instance.getTime());
        String sign = builder.sign(Algorithm.HMAC256(SALT));
        return sign;
    }

    public static DecodedJWT verifyToken(String token){
        JWTVerifier build = JWT.require(Algorithm.HMAC256(SALT)).build();
        DecodedJWT verify = build.verify(token);
        return verify;
    }

}
