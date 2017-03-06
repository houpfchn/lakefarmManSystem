package com.user.service.impl;

import com.user.dao.UserInfoDao;
import com.user.entity.UserInfo;
import com.user.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author hpf
 * @remark 员工操作service实现层
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
     @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo userInfoLogin(UserInfo userInfo) {
        return userInfoDao.userInfoLogin(userInfo);
    }

    @Override
    public List<UserInfo> userInfoFind(Map<String, Object> map) {
        return userInfoDao.userInfoFind(map);
    }

    @Override
    public Long getUserInfoTotal(Map<String, Object> map) {
        return userInfoDao.getUserInfoTotal(map);
    }

    @Override
    public int userInfoUpdate(UserInfo userInfo) {
        return userInfoDao.userInfoUpdate(userInfo);
    }

    @Override
    public int userInfoAdd(UserInfo userInfo) {
        return userInfoDao.userInfoAdd(userInfo);
    }

    @Override
    public int userInfoDelete(String u_id) {
        return userInfoDao.userInfoDelete(u_id);
    }
}
