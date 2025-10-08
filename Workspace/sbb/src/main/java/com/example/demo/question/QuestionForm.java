package com.example.demo.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
	@NotEmpty(message="title is essential")
	@Size(max=200)
	private String subject;
	
	@NotEmpty(message="content is essential")
	private String content;
}
