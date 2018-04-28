package ru.mail.agb88.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;
import java.util.TimeZone;

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
        properties.put(AvailableSettings.DIALECT, env.getProperty(AvailableSettings.DIALECT));
        properties.put(AvailableSettings.SHOW_SQL, env.getProperty(AvailableSettings.SHOW_SQL));
        properties.put(AvailableSettings.FORMAT_SQL, env.getProperty(AvailableSettings.FORMAT_SQL));
        properties.put(AvailableSettings.HBM2DDL_AUTO, env.getProperty(AvailableSettings.HBM2DDL_AUTO));
        properties.put(AvailableSettings.JDBC_TIME_ZONE, TimeZone.getTimeZone("GMT+3:00"));

        return properties;
    }

    @Bean
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
