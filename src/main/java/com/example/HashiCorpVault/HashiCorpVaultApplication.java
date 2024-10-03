package com.example.HashiCorpVault;

import ExternalApiConfig.ExternalApiConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ExternalApiConfig.class)
public class HashiCorpVaultApplication implements CommandLineRunner {

	private final ExternalApiConfig externalApiConfig;

	public HashiCorpVaultApplication(ExternalApiConfig externalApiConfig) {
		this.externalApiConfig = externalApiConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(HashiCorpVaultApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
