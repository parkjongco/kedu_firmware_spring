package com.kedu.firmware.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").
		allowedOrigins("http://192.168.1.43:3000"). // 해당 부분은 파이어베이스 서버 이름으로 바뀔 예정
		allowedMethods("*").
		allowedHeaders("*").
		allowCredentials(true); // <-- 서버와 URL이 다른 곳에서 Credential정보 ( Session Key ) 값을 전송해도 허용하는 설정
	}
}
