package com.user.controller;

import com.user.entity.UserInfo;
import com.user.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/2/27.
 * @author hpf
 * @remark 用户登陆Controller层
 */
@Controller
@RequestMapping("/lakefarm/employee")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/userInfoLogin")
    public String userInfoLogin(UserInfo userInfo, HttpServletRequest request)throws Exception{
        UserInfo resultUser=userInfoService.userInfoLogin(userInfo);
        if(resultUser==null){
            request.setAttribute("userInfo", userInfo);
            request.setAttribute("errorMsg", "用户名或密码错误，请重新输入！");
            return "login";
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("currentUser", resultUser);
            return "redirect:/page/main.jsp";
        }
    }
}
