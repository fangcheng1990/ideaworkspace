/*
package com.lei.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = DataSource1Config.PACKAGE,sqlSessionFactoryRef ="db1SqlSessionFactory")
class DataSource1Config {


    public static final String PACKAGE = "com.lei.dao";

    //    public static final String MAPPER_LOCATION = "classpath:mybatis/mapper/canyin/*.xml";
    public static final String MAPPER_LOCATION = "classpath:mapper/*.xml";
    public static final String CONFIG_LOCATION = "classpath:mapper/mybatis-config.xml";

    @Value("${configdata.driverclassname}")
    public String driverClassName;

    @Value("${configdata.jdbcurl}")
    public String url;

    @Value("${configdata.jdbcusername}")
    public String username;

    @Value("${configdata.jdbcpassword}")
    public String password;

    //初始化数据库连接
    @Primary
    @Bean("db1DataSource")
    public DataSource db1DataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDbType("com.alibaba.druid.pool.DruidDataSource");
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(20);
        return dataSource;
    }

    //数据源事务管理器
    @Primary
    @Bean(name="db1DataSourceTransactionManager")
    public DataSourceTransactionManager db1DataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(db1DataSource());
        return dataSourceTransactionManager;
    }

    //创建Session
    @Primary
    @Bean(name="db1SqlSessionFactory")
    public SqlSessionFactory db1SqlSessionFactory(@Qualifier("db1DataSource") DataSource db1DataSource) throws Exception{
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(db1DataSource);
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(DataSource1Config.MAPPER_LOCATION);
        sqlSessionFactoryBean.setMapperLocations(resource);
        Resource[] resource2 = new PathMatchingResourcePatternResolver().getResources(DataSource1Config.CONFIG_LOCATION);
        sqlSessionFactoryBean.setConfigLocation(resource2[0]);
        return sqlSessionFactoryBean.getObject();
    }
}

*/
