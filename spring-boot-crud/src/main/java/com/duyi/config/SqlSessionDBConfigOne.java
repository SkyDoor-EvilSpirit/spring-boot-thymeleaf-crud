package com.duyi.config;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.duyi.mapper1",sqlSessionFactoryRef = "sqlSessionFactory1")
public class SqlSessionDBConfigOne {
    @Autowired
    @Qualifier("db1")
    private DataSource dataSource1;/**自动注入数据源*/

    /**dataSource的sqlSessionFactory是核心
     * 创建一个sqlSessionFactory*/
    @Bean
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource1);
        return factoryBean.getObject();
    }
    /**利用sqlSessionFactory创建sqlSession
     * mybatis和Spring-boot整合以后，sqlSession变成了sqlSessionTemplate*/
    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(this.sqlSessionFactory1());
        return sqlSessionTemplate;
    }




}
