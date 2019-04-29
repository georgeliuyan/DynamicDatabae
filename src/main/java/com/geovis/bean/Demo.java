/**
 * @class: DynamicDatabase
 * @description: 多源数据库测试类
 * @author: liuyan
 * @create: 2019-04-29 15:24
 **/

package com.geovis.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Demo {
    @Id
    @GeneratedValue
    private long id;
    private String name;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id =id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    @Override
    public String toString() {
        return"Demo[id=" +id +", name=" +name +"]";
    }
}


