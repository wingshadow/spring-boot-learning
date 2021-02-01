package com.hawk.admin.persistence.service.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.google.common.base.Splitter;
import com.hawk.admin.persistence.dao.SysDeptMapper;
import com.hawk.admin.persistence.entity.SysDept;
import com.hawk.admin.persistence.service.SysDeptService;
import com.hawk.core.base.AbstractBaseServiceImpl;
import com.hawk.mybatis.base.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Title: SysDeptServiceImpl
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 14:35
 */
@Slf4j
@Service
public class SysDeptServiceImpl extends BaseServiceImpl<SysDept> implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public List<SysDept> findAllRecursion() {
        return sysDeptMapper.findAllRecursion();
    }

    @Override
    public List<SysDept> findDeptRecursion(Long parentId) {
        return sysDeptMapper.findDeptRecursion(parentId);
    }
}
