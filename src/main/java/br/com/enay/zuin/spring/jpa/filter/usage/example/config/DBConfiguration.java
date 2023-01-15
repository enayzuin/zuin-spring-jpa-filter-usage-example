package br.com.enay.zuin.spring.jpa.filter.usage.example.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource.hikari")
public class DBConfiguration extends HikariConfig {

	@Value("${db.user}")
	private String user;
	
	@Value("${db.password}")
	private String password;
	
	@Value("${db.url}")
	private String url;
	
	/**
	 * Cria o data source para conexão de banco de dados do spring data.
	 * 
	 * @return Data source para o banco de dados.
	 * @throws SQLException
	 */
	@Bean
	DataSource dataSource() throws SQLException {
		return getHikariDataSource();
	}

	/**
	 * Obtém um data source da classe HikariDataSource, com controle do pool de
	 * conexões.
	 * 
	 * @return Data source criado.
	 * @throws SQLException
	 */
	private DataSource getHikariDataSource() throws SQLException {
		this.setDataSourceClassName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");
		this.setUsername(user);
		this.setPassword(password);
		this.addDataSourceProperty("url", url);
		HikariDataSource ds = new HikariDataSource(this);
		return ds;
	}

}
