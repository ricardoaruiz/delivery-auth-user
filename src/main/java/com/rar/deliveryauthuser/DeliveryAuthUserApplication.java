package com.rar.deliveryauthuser;

//import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class DeliveryAuthUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryAuthUserApplication.class, args);
	}


//	Para voltar a usar o H2, habilitar a dependencia no build.gradle e descomentar as linhas dessa classe
//	@Bean
//	public ServletRegistrationBean h2servletRegistration() {
//		ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
//		registration.addUrlMappings("/h2/*");
//		return registration;
//	}

}
