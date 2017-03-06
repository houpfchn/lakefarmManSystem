package com.user.service;

import com.user.entity.Manager;

import java.util.List;
import java.util.Map;

/**
 * @author hpf
 * @remark 后台管理人员service层
 */
public interface ManagerService {
    /**
     * @remark 用户登陆
     * @param manager
     * @return
     */
    public Manager managerLogin(Manager manager);

    /**
     * @remark 用户查找
     * @param map
     * @return
     */
    public List<Manager> managerFind(Map<String, Object> map);

    /**
     * @remark 查找所用户数量
     * @param map
     * @return
     */
    public Long getManagerTotal(Map<String, Object> map);

    /**
     * @remark 更新用户
     * @param manager
     * @return
     */
    public int managerUpdate(Manager manager);

    /**
     * @remark 添加用户
     * @param manager
     * @return
     */
    public int managerAdd(Manager manager);

    /**
     * @remark 删除用户
     * @param man_id
     * @return
     */
    public int managerDelete(String man_id);
}
