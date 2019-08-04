package com.demo.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * 配置本地多数据源事务管理
 */
@Configuration
@EnableTransactionManagement
@ConditionalOnBean({
        DataSourceConfig.class,
        SecondDataSourceConfig.class
})
public class TransactionManagementConfiguration implements TransactionManagementConfigurer {
    @Autowired
    @Qualifier(DataSourceConfig.TRANSACTION_MANAGER_NAME)
    private DataSourceTransactionManager primaryDataSourceConfig;
    @Autowired
    @Qualifier(SecondDataSourceConfig.TRANSACTION_MANAGER_NAME)
    private DataSourceTransactionManager secondDataSourceConfig;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new ChainedTransactionManager(primaryDataSourceConfig, secondDataSourceConfig);
    }
}
