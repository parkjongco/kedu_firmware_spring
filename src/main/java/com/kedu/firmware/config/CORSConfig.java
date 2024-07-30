package com.kedu.firmware.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").
<<<<<<< HEAD
		allowedOrigins("http://192.168.1.43:3000", "http://localhost:3000"). // 해당 부분은 파이어베이스 서버 이름으로 바뀔 예정
=======
		allowedOrigins("http://192.168.1.43:3000"). // 해당 부분은 파이어베이스 서버 이름으로 바뀔 예정
>>>>>>> 74f2520ee7df200d671f3aa54d9a3c54909f5162
		allowedMethods("*").
		allowedHeaders("*").
		allowCredentials(true); // <-- 서버와 URL이 다른 곳에서 Credential정보 ( Session Key ) 값을 전송해도 허용하는 설정
	}
}
