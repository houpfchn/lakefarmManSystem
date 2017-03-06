package com.user.service.impl;

import com.user.dao.ManagerDao;
import com.user.entity.Manager;
import com.user.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author hpf
 * @remark 后台管理人员实现层
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
    @Resource
    private ManagerDao managerDao;
    /**
     * @param manager
     * @return
     * @remark 用户登陆
     */
    @Override
    public Manager managerLogin(Manager manager) {
        return managerDao.managerLogin(manager);
    }

    /**
     * @param map
     * @return
     * @remark 用户查找
     */
    @Override
    public List<Manager> managerFind(Map<String, Object> map) {
        return managerDao.managerFind(map);
    }

    /**
     * @param map
     * @return
     * @remark 查找所用户数量
     */
    @Override
    public Long getManagerTotal(Map<String, Object> map) {
        return managerDao.getManagerTotal(map);
    }

    /**
     * @param manager
     * @return
     * @remark 更新用户
     */
    @Override
    public int managerUpdate(Manager manager) {
        return managerDao.managerUpdate(manager);
    }

    /**
     * @param manager
     * @return
     * @remark 添加用户
     */
    @Override
    public int managerAdd(Manager manager) {
        return managerDao.managerAdd(manager);
    }

    /**
     * @param man_id
     * @return
     * @remark 删除用户
     */
    @Override
    public int managerDelete(String man_id) {
        return managerDao.managerDelete(man_id);
    }
}
