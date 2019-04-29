/**
 * @class: DynamicDatabase
 * @description: 测试接口类
 * @author: liuyan
 * @create: 2019-04-29 16:28
 **/

package com.geovis.dao;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.List;

import com.geovis.bean.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * 不指定数据源使用默认数据源
     *
     * @return
     */
    public List<Demo> getList() {
        String sql = "select * from Demo";

        return (List<Demo>) jdbcTemplate.query(sql, new RowMapper<Demo>(){
            @Override
            public Demo mapRow(ResultSet rs, int rowNum) throws SQLException {
                Demo demo = new Demo();
                demo.setId(rs.getLong("id"));
                demo.setName(rs.getString("name"));
                return demo;
            }
        });
    }
}

