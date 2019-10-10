package cn.zcp.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-10-09 16:32
 * @describe spring-redis-sso <描述>
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public UserController() {
        System.out.println("初始化...");
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        System.out.println("-------------");
        request.setAttribute("name","zcp");
        request.getSession().setAttribute("user","123456");
        redisTemplate.opsForValue().set("test","test");
        return "home";
    }
}
