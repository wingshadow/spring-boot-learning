package com.hawk.admin.persistence.service;

import com.github.pagehelper.PageInfo;
import com.hawk.admin.persistence.entity.SysMenu;
import com.hawk.admin.persistence.entity.SysUser;
import com.hawk.mybatis.base.BaseService;

import java.util.List;

/**
 * @Title: SysMenuService
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 14:53
 */
public interface SysMenuService extends BaseService<SysMenu> {

    /**
     * 查询用户的菜单信息
     * @param user
     * @return
     */
    List<SysMenu> listByUserId(SysUser user);

    /**
     * 查询角色菜单信息
     * @param roleId
     * @return
     */
    List<SysMenu> listByRoleId(Long roleId);

    /**
     * 查询菜单信息返回Tree结构List
     * @return
     */
    List<SysMenu> findMenuRecursion(Long parentId);

    List<SysMenu> findUserMenuTree(SysUser user);
}
