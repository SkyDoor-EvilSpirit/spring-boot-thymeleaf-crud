package com.duyi.config;

import com.duyi.mapper2.GuestMapper2;
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
@MapperScan(basePackages = "com.duyi.mapper2",sqlSessionFactoryRef = "sqlSessionFactory2")
public class SqlSessionDBConfigTwo {
    @Autowired
    @Qualifier("db2")
    private DataSource dataSource1;


    @Bean
    public SqlSessionFactory sqlSessionFactory2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource1);
        return factoryBean.getObject();
    }
    @Bean
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(this.sqlSessionFactory2());
        return sqlSessionTemplate;
    }




}
