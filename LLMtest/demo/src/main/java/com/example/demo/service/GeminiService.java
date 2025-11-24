package com.example.demo.service;

import com.example.demo.model.ChatMessage;
import com.google.gson.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeminiService {
	@Value("${gemini.api.key}")
	private String apiKey;
	
	private static final String GEMINI_API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent";
	
	private final List<ChatMessage> chatHistory = new ArrayList<>();
	
	public List<ChatMessage> getChatHistory() {
		return chatHistory;
	}
	
	public String sendMessage(String userMessage) {
		chatHistory.add(new ChatMessage("user", userMessage));
		
		try {
			RestTemplate restTemplate = new RestTemplate();
			
            JsonObject textPart = new JsonObject();
            textPart.addProperty("text", userMessage);

            JsonArray parts = new JsonArray();
            parts.add(textPart);

            JsonObject content = new JsonObject();
            content.addProperty("role", "user");
            content.add("parts", parts);

            JsonArray contents = new JsonArray();
            contents.add(content);

            JsonObject requestBody = new JsonObject();
            requestBody.add("contents", contents);

            // 요청 헤더
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<String> entity = new HttpEntity<>(requestBody.toString(), headers);

            // 호출
            String requestUrl = GEMINI_API_URL + "?key=" + apiKey;
            ResponseEntity<String> response =
                    restTemplate.postForEntity(requestUrl, entity, String.class);

            String reply = extractTextFromResponse(response.getBody());
            chatHistory.add(new ChatMessage("model", reply));
            return reply;

        } catch (Exception e) {
            String errorMsg = "오류 발생: " + e.getMessage();
            chatHistory.add(new ChatMessage("model", errorMsg));
            return errorMsg;
        }
    }

    private String extractTextFromResponse(String jsonResponse) {
        try {
            JsonObject obj = JsonParser.parseString(jsonResponse).getAsJsonObject();
            return obj.getAsJsonArray("candidates")
                    .get(0).getAsJsonObject()
                    .getAsJsonObject("content")
                    .getAsJsonArray("parts")
                    .get(0).getAsJsonObject()
                    .get("text").getAsString();
        } catch (Exception e) {
            return "응답 파싱 오류: " + e.getMessage();
        }
    }
}