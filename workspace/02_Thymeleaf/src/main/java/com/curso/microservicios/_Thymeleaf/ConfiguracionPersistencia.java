package com.curso.microservicios._Thymeleaf;

import javax.sql.DataSource;

import org.springframework.boot.jta.narayana.NarayanaDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("desarrollo")
public class ConfiguracionPersistencia {
	@Bean //<bean>
	public DataSource dataSource() {
		DataSource ds = new NarayanaDataSourceBean(null);
		return ds;
	}
}
