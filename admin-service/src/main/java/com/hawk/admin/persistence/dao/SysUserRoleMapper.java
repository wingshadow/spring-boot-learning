package com.hawk.admin.persistence.dao;

import com.hawk.admin.persistence.entity.SysMenu;
import com.hawk.admin.persistence.entity.SysUserRole;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysUserRoleMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 15:48
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    void deleteByUserId(Long userId);

    void deleteByUserIds(List<Long> list);
}
