package com.hawk.admin.persistence.dao;

import com.hawk.admin.persistence.entity.SysMenu;
import com.hawk.admin.persistence.entity.SysRole;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysRoleMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 15:33
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
}
