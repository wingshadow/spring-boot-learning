package com.hawk.admin.persistence.service;

import com.github.pagehelper.PageInfo;
import com.hawk.admin.persistence.entity.SysUserRole;
import com.hawk.mybatis.base.BaseService;

import java.util.List;

/**
 * @Title: SysUserRoleService
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 10:33
 */
public interface SysUserRoleService extends BaseService<SysUserRole> {


    void deleteByUserId(Long userId);

    void deleteByUserIds(List<Long> userIds);
}
