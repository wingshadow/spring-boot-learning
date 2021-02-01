package com.hawk.admin.persistence.service.impl;

import com.hawk.admin.persistence.dao.SysUserRoleMapper;
import com.hawk.admin.persistence.entity.SysUserRole;
import com.hawk.admin.persistence.service.SysUserRoleService;
import com.hawk.mybatis.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: SysUserRoleServiceImpl
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 11:22
 */
@Service
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRole> implements SysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public void deleteByUserId(Long userId) {
        sysUserRoleMapper.deleteByUserId(userId);
    }

    @Override
    public void deleteByUserIds(List<Long> userIds){
        sysUserRoleMapper.deleteByUserIds(userIds);
    }
}
