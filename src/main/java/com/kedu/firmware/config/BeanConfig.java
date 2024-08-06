package com.kedu.firmware.config;

import org.springframework.context.annotation.Bean;


import com.google.gson.Gson;

public class BeanConfig {

	
	
	@Bean
	public Gson getGson() {
		return new Gson();
	}
	
}
