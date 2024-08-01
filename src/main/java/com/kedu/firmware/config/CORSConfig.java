package com.kedu.firmware.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer {

<<<<<<< HEAD
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://192.168.1.11:3000") // 클라이언트 주소를 추가합니다
=======
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://192.168.1.11:3000")
>>>>>>> origin/master
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .allowedHeaders("*")
            .allowCredentials(true);
    }
	
	
	
	
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")
//		.allowedOrigins("http://localhost:3000", "http://192.168.0.10:3000")
//        .allowedMethods("*")
//        .allowedHeaders("*");
//	}
	
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")
//		.allowedOrigins("http://localhost:3000", "http://192.168.0.10:3000")
//        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//        .allowedHeaders("*");
//	}
}
