package com.hawk.admin.persistence.service;

import com.github.pagehelper.PageInfo;
import com.hawk.admin.persistence.entity.SysRoleMenu;
import com.hawk.mybatis.base.BaseService;

import java.util.List;

/**
 * @Title: SysRoleMenuService
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 10:32
 */
public interface SysRoleMenuService extends BaseService<SysRoleMenu> {



    void deleteByRoleId(Long roleId);

    void deleteBatchByRoleIds(List<Long> ids);
}
