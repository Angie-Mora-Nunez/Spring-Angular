package com.example;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "clientEntityManagerFactory", transactionManagerRef = "clientTransactionManager", basePackages = {
        "com.example.labspringboot.repository"
})
public class clientconfig {

    @Autowired
    private Environment env;

    @Primary
    @Bean(name = "clientDataSource")
    public DataSource clientDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(env.getProperty("legacy.datasource.url"));
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        return dataSource;
    }


    @Primary
    @Bean(name = "clientEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(clientDataSource());
        em.setPackagesToScan("package com.example.labspringboot.domain;");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.show-sql", env.getProperty("spring.jpa.show-sql"));
        properties.put("hibernate.dialect", env.getProperty("spring.jpa.database-platform"));

        em.setJpaPropertyMap(properties);

        return em;

    }

    @Primary
    @Bean(name = "clientTransactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return transactionManager;
    }

}

