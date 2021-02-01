package com.hawk.admin.persistence.service.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.google.common.base.Splitter;
import com.hawk.admin.persistence.dao.SysRoleMapper;
import com.hawk.admin.persistence.dao.SysRoleMenuMapper;
import com.hawk.admin.persistence.entity.SysRole;
import com.hawk.admin.persistence.service.SysRoleService;
import com.hawk.core.base.AbstractBaseServiceImpl;
import com.hawk.mybatis.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Title: SysRoleServiceImpl
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/28 11:10
 */
@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public void deleteRoles(List<Long> roleIds){
        deleteBatchByPrimaryKeys(roleIds);
        sysRoleMenuMapper.deleteBatchByRoleIds(roleIds);
    }
}
