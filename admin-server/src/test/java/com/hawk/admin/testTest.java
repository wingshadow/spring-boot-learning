package com.hawk.admin;

import com.alibaba.fastjson.JSON;
import com.hawk.admin.persistence.dao.SysDictMapper;
import com.hawk.admin.persistence.service.SysDictService;
import com.hawk.admin.persistence.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AdminApplication.class})
public class testTest {

    @Resource
    private SysDictService  sysDictService;

    @Resource
    private SysUserService sysUserService;

    @Test
    public void test(){
        log.info("{}", JSON.toJSONString(sysDictService.getByPrimaryKey(259352796753694720L)));
    }

    @Test
    public void test2(){
        sysDictService.deleteByPrimaryKey(1L);
    }

    @Test
    public void test3(){
        log.info("{}",sysDictService.listByPage(null,1,1));
    }

    @Test
    public void test4(){
        log.info("{}",sysUserService.findALLPermissions());
    }
}