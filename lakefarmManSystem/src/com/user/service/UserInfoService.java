package com.user.service;
import com.user.entity.UserInfo;
import java.util.List;
import java.util.Map;

/**
 * @author hpf
 * @remark 用户操作service层
 */
public interface UserInfoService {
    /**
     * @remark 用户登陆
     * @param userInfo
     * @return
     */
    public UserInfo userInfoLogin(UserInfo userInfo);

    /**
     * @remark 用户查找
     * @param map
     * @return
     */
    public List<UserInfo> userInfoFind(Map<String, Object> map);

    /**
     * @remark 查找所用户数量
     * @param map
     * @return
     */
    public Long getUserInfoTotal(Map<String, Object> map);

    /**
     * @remark 更新用户
     * @param userInfo
     * @return
     */
    public int userInfoUpdate(UserInfo userInfo);

    /**
     * @remark 添加用户
     * @param userInfo
     * @return
     */
    public int userInfoAdd(UserInfo userInfo);

    /**
     * @remark 删除用户
     * @param u_id
     * @return
     */
    public int userInfoDelete(String u_id);
}
