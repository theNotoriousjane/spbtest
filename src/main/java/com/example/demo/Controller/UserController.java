package com.example.demo.Controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserLoginService userLoginService;

    /**
     * 跳转到用户登录页面
     * @return 登录页面
     */
    @RequestMapping("/loginhtml")
    public String loginHtml(){
        return "login";
    }
    @RequestMapping(value = "login.action")
    public String userlogin(HttpServletRequest request, HttpSession session){
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        User user = userLoginService.userlogin(username,password);
        session.setAttribute("session_user",user);
        if(user != null){
            return "main";
        }
        return "loginerror";
    }
}
