package com.hawk.admin.persistence.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.google.common.base.Splitter;
import com.hawk.admin.persistence.dao.*;
import com.hawk.admin.persistence.entity.SysMenu;
import com.hawk.admin.persistence.entity.SysRole;
import com.hawk.admin.persistence.entity.SysUser;
import com.hawk.admin.persistence.entity.SysUserRole;
import com.hawk.admin.persistence.service.SysUserService;
import com.hawk.mybatis.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * @Title: SysUserServiceImpl
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 11:42
 */
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {

    @Resource
    private SysMenuMapper sysMenuMapper;

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Resource
    private SysRoleMapper sysRoleMapper;





    private String getRoleNames(List<SysUserRole> userRoles) {
        StringBuilder sb = new StringBuilder();
        for (Iterator<SysUserRole> iter = userRoles.iterator(); iter.hasNext(); ) {
            SysUserRole userRole = iter.next();
            SysRole sysRole = sysRoleMapper.selectByPrimaryKey(userRole.getRoleId());
            if (sysRole == null) {
                continue;
            }
            sb.append(sysRole.getRemark());
            if (iter.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysUser sysUser, List<SysUserRole> list) {
        sysUserRoleMapper.deleteByUserId(sysUser.getId());
        sysUserRoleMapper.insertList(list);
        sysUserMapper.insert(sysUser);

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(SysUser sysUser, List<SysUserRole> list) {
        sysUserRoleMapper.deleteByUserId(sysUser.getId());
        sysUserRoleMapper.insertList(list);
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public Set<String> findPermissions(Long userId) {
        Set<String> perms = new HashSet<>();
        SysUser user = sysUserMapper.selectByPrimaryKey(userId);
        List<SysMenu> list = sysMenuMapper.selectByUserId(user.getId());
        if (CollUtil.isNotEmpty(list)) {
            for (SysMenu sysMenu : list) {
                if (sysMenu.getPerms() != null && !"".equals(sysMenu.getPerms())) {
                    perms.add(sysMenu.getPerms());
                }
            }
        }
        return perms;
    }

    @Override
    public Set<String> findALLPermissions(){
        Set<String> perms = new HashSet<>();
        List<SysMenu> list =  sysMenuMapper.selectAll();
        if (CollUtil.isNotEmpty(list)) {
            for (SysMenu sysMenu : list) {
                if (sysMenu.getPerms() != null && !"".equals(sysMenu.getPerms())) {
                    perms.add(sysMenu.getPerms());
                }
            }
        }
        return perms;
    }

    @Override
    public SysUser findUserName(String userName) {
        SysUser sysUser = new SysUser();
        sysUser.setName(userName);
        List<SysUser> list = sysUserMapper.select(sysUser);
        if (CollUtil.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public void deleteUserIds(List<Long> userIds){
        deleteBatchByPrimaryKeys(userIds);
        sysUserRoleMapper.deleteByUserIds(userIds);
    }

    @Override
    public SysUser selectByName(String name){
        return sysUserMapper.selectByName(name);
    }

    @Override
    public SysUser selectByMobile(String mobile){
        return sysUserMapper.selectByMobile(mobile);
    }
}
