package com.hawk.admin.persistence.dao;

import com.hawk.admin.persistence.entity.SysMenu;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysMenuMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 14:55
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {


    List<SysMenu> selectByUserId(Long userId);

    List<SysMenu> selectByRoleId(Long roleId);

    List<SysMenu> findMenuRecursion(Long parentId);
}
