package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.GeminiService;

import java.util.List;

@Controller
public class GeminiController {
	private final GeminiService geminiService;
	
	public GeminiController(GeminiService geminiService) {
		this.geminiService = geminiService;
	}
	
	@GetMapping("/")
	public String chatPage(Model model) {
		model.addAttribute("chatHistory", geminiService.getChatHistory());
		return "chat";
	}
	
	@PostMapping("/chat")
	@ResponseBody
	public String sendMessage(@RequestBody String message) {
		String cleanMsg = message.replace("{\"message\":\"", "").replace("\"}", "");
		return geminiService.sendMessage(cleanMsg);
	}
}
