package com.example.securecredentials;

import com.example.securecredentials.web.ServiceInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SecureCredentialsDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecureCredentialsDemoApplication.class, args);
	}

	@Configuration
	public static class SecretConfiguration {
		@Bean
		@ConfigurationProperties(prefix="vcap.services.secure-credential.credentials.serviceinfo")
		public ServiceInfo serviceInfo() {
			return new ServiceInfo();
		}
	}
}
