package ru.mail.agb88.controller.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Hibernate configuration
 * Created by AlexBal
 */
@Configuration
@EnableTransactionManagement
@PropertySource(value = "classpath:config.properties")
public class HibernateConfig {

    @Autowired
    private Environment env;

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));

        return properties;
    }

    /*@Bean
    @Profile("default")
    public DataSource developDataSource() {
        DriverManagerDataSource developDataSource = new DriverManagerDataSource();
        developDataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        developDataSource.setUrl(env.getProperty("jdbc.url"));
        developDataSource.setUsername(env.getProperty("jdbc.username"));
        developDataSource.setPassword(env.getProperty("jdbc.password"));

        return developDataSource;
    }*/

    @Bean
    //@Profile("heroku")
    public DataSource herokuDataSource() {
        DriverManagerDataSource herokuDataSource = new DriverManagerDataSource();
        herokuDataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        herokuDataSource.setUrl(env.getProperty("heroku.jdbc.url"));
        herokuDataSource.setUsername(env.getProperty("heroku.jdbc.username"));
        herokuDataSource.setPassword(env.getProperty("heroku.jdbc.password"));

        return herokuDataSource;
    }

    @Bean
    @Autowired
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan("ru.mail.agb88.repository.model");
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(s);

        return txManager;
    }
}
