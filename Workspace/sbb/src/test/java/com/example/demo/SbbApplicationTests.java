package com.example.demo;

// import java.time.LocalDateTime; -- save data -> database
// import java.util.list; -- check data <- database (findAll)
// import java.util.Optional; -- check data <- database (findById)

import com.example.demo.question.QuestionService;

//import static org.junit.jupiter.api.Assertions.assertEquals; // only using modify data 
//import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//
//import com.example.demo.answer.Answer;
//import com.example.demo.question.Question;
//import com.example.demo.question.QuestionRepository;


@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionService questionService;
	
//	@Autowired
//	private AnswerRepository answerRepository;
	
//	@Transactional
	@Test
	void testJpa() {
		
		/* save data -> database */
//		Question q1 = new Question();
//		q1.setSubject("what is sbb?");
//		q1.setContent("I want to know about sbb.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("question about spring boot model");
//		q2.setContent("is id created automatically?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
		
		/* check data <- database (findAll) */
//		List<Optional> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//		
//		Question q = all.get(0);
//		assertEquals("what is sbb?", q.getSubject());
		
		
		/* check data <- database (findById) */
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("what is sbb?", q.getSubject());
//		}
		
		/* check data <- database (findBySubject) */
//		Question q = this.questionRepository.findBySubject("what is sbb?");
//		assertEquals(1, q.getId());
		
		
		/* check data <- database (findBySubjectAndContent  )*/
//		Question q = this.questionRepository.findBySubjectAndContent("what is sbb?", "I want to know about sbb.");
//		assertEquals(1, q.getId());
		
		
		/* check data <- database (findBySubjectLike) */
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		
//		assertEquals("what is sbb?", q.getSubject());
		
		/* modify data <- database */
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("modified subject");
//		
//		this.questionRepository.save(q);
		
		
		/* delete data <- database */
//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, this.questionRepository.count());
		
		
		/* save answer -> database */
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		Answer a = new Answer();
//		a.setContent("yes, it will be created automatically");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
		
		
		/* check answer <- database */
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());
		
		
		/* check data from question <- database */
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		List<Answer> answerList = q.getAnswerList();
//		
//		assertEquals(1, answerList.size());
//		assertEquals("yes, it will be created automatically", answerList.get(0).getContent());
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다 : [%03d]", i);
			String content = "내용 없음 ";
			this.questionService.create(subject, content);
		}
		
	}
}