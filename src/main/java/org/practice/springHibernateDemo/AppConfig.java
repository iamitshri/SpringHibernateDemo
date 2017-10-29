package org.practice.springHibernateDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * 
 * Step 1) Config Dependencies: Add hibernate, spring, spring mvc to maven
 * Connect to DB: Create hibernate config to connect to mysql schema course_mgmt
 * 
 * 
 * 1) Create and annotate model classes as per course_mgmt schema 2) Create
 * Simple CRUD service on adding student, course and teacher info 3) Create
 * service to fetch student, course and teacher by ID 4) Create UI that allows
 * user to enter new student, new course and new teacher Student has student
 * detail -> one to one Student and Course -> Many to Many Course to Teacher -->
 * Many teachers to can teach one course Teacher to Course --> 1 to 1
 * 
 * That has rest services.
 * 
 * 
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScans(value ={ @ComponentScan("org.practice.springHibernateDemo") })
public class AppConfig {
	 
	@Bean
	public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("course_mgmt");
		return factoryBean;
	}

	@Bean
	public JpaTransactionManager geJpaTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
		return transactionManager;
	}
}
