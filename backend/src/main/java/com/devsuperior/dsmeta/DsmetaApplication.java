package com.devsuperior.dsmeta;

import com.devsuperior.dsmeta.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsmetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsmetaApplication.class, args);
	}

	SecurityConfig securityConfig = new SecurityConfig();

	public SecurityConfig getSecurityConfig() {
		return securityConfig;
	}
}
