package com.project.chatting.config;

import com.project.chatting.handler.ChatHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@EnableWebSocket
@RequiredArgsConstructor
@Configuration
public class WebSocketConfig implements WebSocketConfigurer{

    private final ChatHandler chatHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(chatHandler, "ws/chat").setAllowedOrigins("*");
    }
}
