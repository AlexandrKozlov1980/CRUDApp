package web.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//import javax.annotation.Resourse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//@Configuration
//@EnableJpaRepositories("web") //????
//@EnableTransactionManagement
//@PropertySource("classpath:db.properties")
//@ComponentScan("web")

public class DataBaseConfig {

//    //@Resourse
//    @Autowired
//    private Environment env; //spring?
//
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource());
//        em.setPackagesToScan(env.getRequiredProperty("db.entity.package"));
//        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        em.setJpaProperties(getHibernateProperties());
//        return em;
//    }
//
//    private Properties getHibernateProperties() {
//
//       try {
//
//           Properties properties = new Properties();
//           InputStream is = getClass().getClassLoader().getResourceAsStream("hibernate.properties");
//           properties.load(is);
//
//           return properties;
//       }catch (IOException e){
//           throw new IllegalArgumentException("error");
//       }
//        //return hibernateProperties;
//    }
//
//
//    @Bean
//    public DataSource dataSource(){
//        BasicDataSource ds = new BasicDataSource();
//        ds.setUrl(env.getRequiredProperty("db.url"));
//        ds.setDriverClassName(env.getRequiredProperty("db.driver"));
//        ds.setUsername(env.getRequiredProperty("db.username"));
//        ds.setPassword(env.getRequiredProperty("db.password"));
//        return ds;
//    }

}
