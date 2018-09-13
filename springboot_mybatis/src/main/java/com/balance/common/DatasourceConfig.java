package com.balance.common;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liukai on 2018/9/13.
 */
@Configuration
@MapperScan(basePackages = "com.balance.mapper")
public class DatasourceConfig {
    @Bean
    @ConfigurationProperties("jdbc.ds")
    public DataSource readDataSource(){
        return new DruidDataSource();
    }
    @Bean(name="student")
    public Map<String,String> getMap(){
        Map map=new HashMap<String,String >();
        map.put("name","张三");
        map.put("age","24");
        map.put("sex","男");
        return map;
    }
    @Bean(name="teacher")
    public Map<String,String> getTeaMap(){
        Map map=new HashMap<String,String >();
        map.put("name","李四");
        map.put("age","24");
        map.put("sex","男");
        return map;
    }
}
