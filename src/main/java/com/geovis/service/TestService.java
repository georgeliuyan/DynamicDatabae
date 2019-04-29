/**
 * @class: DynamicDatabase
 * @description: 测试服务类
 * @author: liuyan
 * @create: 2019-04-29 16:35
 **/

package com.geovis.service;

import com.geovis.bean.Demo;
import com.geovis.dao.TestDao;
import com.geovis.datasource.TargetDataSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestDao testDao;

    /**
     *不指定数据源使用默认数据源
     *@return
     */

    public List<Demo> getList(){
        return testDao.getList();
    }

    /**
     * 指定数据源
     * @return
     */
    @TargetDataSource(name = "ds1")
    public List<Demo> getListByDs1(){
        return testDao.getList();
    }

    @TargetDataSource(name = "ds2")
    public List<Demo> getListByDs2(){
        return testDao.getList();
    }

}


