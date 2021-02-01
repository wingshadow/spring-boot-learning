package com.hawk.admin.persistence.service;

import com.hawk.admin.persistence.entity.SysUser;
import com.hawk.admin.persistence.entity.SysUserRole;
import com.hawk.mybatis.base.BaseService;

import java.util.List;
import java.util.Set;

/**
 * @Title: SysUserService
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 10:33
 */
public interface SysUserService extends BaseService<SysUser> {




    /**
     * 查询用户权限结果集
     *
     * @param userId
     * @return
     */
    Set<String> findPermissions(Long userId);

    Set<String> findALLPermissions();

    SysUser findUserName(String userName);

    void save(SysUser sysUser, List<SysUserRole> list);

    void update(SysUser sysUser, List<SysUserRole> list);

    void deleteUserIds(List<Long> userIds);

    SysUser selectByName(String name);

    SysUser selectByMobile(String mobile);


}
