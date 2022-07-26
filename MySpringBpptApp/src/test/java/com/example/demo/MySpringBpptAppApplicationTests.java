package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringBpptAppApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(MySpringBpptAppApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case executing");
		logger.info("test case executing second logger statement");
		logger.info("test case executing third logger statement");
	assertEquals(true, true);
	}

}
 	
