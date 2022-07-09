package com.codewithdurgesh.blog.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getInfo()).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
				
		
	}
	private ApiInfo getInfo() {
		return new ApiInfo("Blogging Application : Backend Course", "This project is developed by learn Code with Durgesh", "1.0", "Terms of Service", new Contact("Pandurang", "panduranghande502@gmail.com", null), null, null);
		
	};

}
