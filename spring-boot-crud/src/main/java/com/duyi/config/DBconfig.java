package com.duyi.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

import javax.sql.DataSource;
/**创建一个配置类，创建多个数据源放进spring容器中*/
@Configuration
public class DBconfig {
    @Bean(name = "db1")
    @ConfigurationProperties("spring.datasource.db1")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "db2")
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }





}
