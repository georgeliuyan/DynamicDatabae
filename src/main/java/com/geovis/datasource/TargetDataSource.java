/**
 * @class: DynamicDatabase
 * @description: 标识要使用的数据源
 * @author: liuyan
 * @create: 2019-04-29 11:23
 **/

package com.geovis.datasource;

import java.lang.annotation.*;

/**
 * 在方法上使用，用于指定使用哪个数据源
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String name();
}


