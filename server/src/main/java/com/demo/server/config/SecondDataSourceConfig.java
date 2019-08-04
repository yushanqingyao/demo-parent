package com.demo.server.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = SecondDataSourceConfig.MAPPER_PACKAGE,sqlSessionFactoryRef = SecondDataSourceConfig.SESSION_FACTORY_NAME)
public class SecondDataSourceConfig {
    static final String MAPPER_PACKAGE = "com.demo.server.mapper.second";
    private static final String DATASOURCE_PREFIX = "spring.datasource.druid.second";
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";


    static final String DATA_SOURCE_NAME = "secondDataSource";
    static final String SESSION_FACTORY_NAME = "secondSqlSessionFactory";
    static final String TRANSACTION_MANAGER_NAME = "secondTransactionManager";

    @Bean(name = DATA_SOURCE_NAME)
    @ConfigurationProperties(prefix = SecondDataSourceConfig.DATASOURCE_PREFIX)
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

    @Bean(name = SESSION_FACTORY_NAME)
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DATA_SOURCE_NAME) DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/configuration.xml"));
        return bean.getObject();
    }

    @Bean(name = TRANSACTION_MANAGER_NAME)
    public DataSourceTransactionManager transactionManager(@Qualifier(DATA_SOURCE_NAME) DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
