package com.hexagonal.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.hexagonal.infra.HexagonalConfiguration;

@Import(HexagonalConfiguration.class)
public class HexagonalApplication {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
