package com.user.controller;

import com.user.entity.Manager;

import com.user.service.ManagerService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/2/27.
 * @author hpf
 * @remark 后台用户Controller层
 */
@Controller
@RequestMapping("/lakefarm/manager")
public class ManagerController {
    @Resource
    private ManagerService managerService;
    
    @RequestMapping("/managerLogin")
    public String managerLogin(Manager manager, HttpServletRequest request)throws Exception{
        Manager resultUser=managerService.managerLogin(manager);
        if(resultUser==null){
            request.setAttribute("manager", manager);
            request.setAttribute("errorMsg", "用户名或密码错误，请重新输入！");
            return "login";
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("currentUser", resultUser);
            return "redirect:/page/main.jsp";
        }
    }
}
