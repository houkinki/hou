package com.ex.hou.controller;

import com.ex.hou.client.NoticeWebsocket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	@GetMapping("/test")
    public String test() {
    	NoticeWebsocket.sendMessage("你好，WebSocket");
        return "/test";

    }
}
