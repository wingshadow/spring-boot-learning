package com.hawk.admin.persistence.dao;

import com.hawk.admin.persistence.entity.SysMenu;
import com.hawk.admin.persistence.entity.SysUser;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysUserMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 15:47
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {


    SysUser selectByName(String name);

    SysUser selectByMobile(String mobile);
}
