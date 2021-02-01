package com.hawk.admin.persistence.service.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.google.common.base.Splitter;
import com.hawk.admin.persistence.dao.SysDictMapper;
import com.hawk.admin.persistence.entity.SysDict;
import com.hawk.admin.persistence.service.SysDictService;
import com.hawk.core.base.AbstractBaseServiceImpl;
import com.hawk.mybatis.base.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * SysDictServiceImpl Service接口实现类
 *
 * @author fy
 * @version 1.0.0 2019-10-22 08:45:49 初始创建
 */

@Slf4j
@Service
public class SysDictServiceImpl extends BaseServiceImpl<SysDict> implements SysDictService {

}
