/**
 * @class: DynamicDatabase
 * @description: 启动类
 * @author: liuyan
 * @create: 2019-04-29 11:00
 **/

package com.geovis;

import com.geovis.datasource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class Application{
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}


