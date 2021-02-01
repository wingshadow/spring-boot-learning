package com.hawk.admin.persistence.service;

import com.github.pagehelper.PageInfo;
import com.hawk.admin.persistence.entity.SysRole;
import com.hawk.mybatis.base.BaseService;

import java.util.List;

/**
 * @Title: SysRoleService
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 10:32
 */
public interface SysRoleService extends BaseService<SysRole> {



    void deleteRoles(List<Long> roleIds);
}
