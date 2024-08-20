package com.kedu.firmware.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/queue", "/topic"); // 메시지를 전달할 브로커 경로
        config.setApplicationDestinationPrefixes("/app"); // 메시지 발행 요청 경로의 접두사
        config.setUserDestinationPrefix("/user"); // 개인 사용자 큐 접두사
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws")
            .setAllowedOrigins(
                "http://192.168.1.11:3000",
                "http://192.168.1.10:3000",
                "http://192.168.1.36:3000",
                "http://192.168.1.172:3000",
                "http://192.168.1.43:3000",
                "http://localhost:3000",
                    "http://192.168.219.103:3000"
            ) // 프론트엔드 출처와 동일한 출처로 설정
            .withSockJS(); // SockJS를 사용할 경우 추가 설정
    }
}
