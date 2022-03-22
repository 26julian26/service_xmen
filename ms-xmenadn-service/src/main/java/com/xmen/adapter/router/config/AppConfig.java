package com.xmen.adapter.router.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import static com.xmen.adapter.router.consts.DataRouterConsts.COMPONENT_SCAN;

@Configuration
@ComponentScan(COMPONENT_SCAN)
public class AppConfig {
	
	@Bean
	RestTemplate restTemplate() {
	return new RestTemplate();
	}	

}
