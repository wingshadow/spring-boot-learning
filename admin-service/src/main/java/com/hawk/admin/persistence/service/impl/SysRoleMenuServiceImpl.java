package com.hawk.admin.persistence.service.impl;

import com.hawk.admin.persistence.dao.SysRoleMenuMapper;
import com.hawk.admin.persistence.entity.SysRoleMenu;
import com.hawk.admin.persistence.service.SysRoleMenuService;
import com.hawk.mybatis.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: SysRoleMenuServiceImpl
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 10:48
 */
@Service
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenu> implements SysRoleMenuService {

    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public void deleteByRoleId(Long roleId) {
        sysRoleMenuMapper.deleteByRoleId(roleId);
    }

    @Override
    public void deleteBatchByRoleIds(List<Long> ids) {
        sysRoleMenuMapper.deleteBatchByRoleIds(ids);
    }
}
