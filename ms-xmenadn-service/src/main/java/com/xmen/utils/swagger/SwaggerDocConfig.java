package com.xmen.utils.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.xmen.adapter.router.consts.DataRouterConsts.SWAGGER_DESCRIPTION;
import static com.xmen.adapter.router.consts.DataRouterConsts.SWAGGER_TITTLE;
import static com.xmen.adapter.router.consts.DataRouterConsts.SWAGGER_VERSION;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableSwagger2
public class SwaggerDocConfig implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.htmlo").addResourceLocations("classpath:/META-INF/resources");
		registry.addResourceHandler("webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
	@Bean
	public Docket documentation() {
	return new Docket(DocumentationType.SWAGGER_2)
	.useDefaultResponseMessages(false)
	.select()
	.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
	.build()
	.apiInfo(metaData());
	}

	private ApiInfo metaData() {
	return new ApiInfoBuilder()
	.title(SWAGGER_TITTLE)
	.description(SWAGGER_DESCRIPTION)
	.version(SWAGGER_VERSION)
	.build();
	}

}
