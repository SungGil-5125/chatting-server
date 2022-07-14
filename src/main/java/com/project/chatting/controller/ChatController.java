package com.project.chatting.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ChatController {

    @GetMapping("/chat")
    public String chatGet(){
        log.info("@ChatController, chat Get()");
        return "socket/chat";
    }
}
