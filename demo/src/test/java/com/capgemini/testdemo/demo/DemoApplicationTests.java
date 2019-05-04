package com.capgemini.testdemo.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.testdemo.demo.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private HelloController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();

	}

	@Test
	public void testHelloWorld() {
		assertEquals("HelloWorld", new HelloController().message());
	}

	@Test
	public void testNotHelloWorld() {
		assertNotEquals("Hello", new HelloController().message());
	}

}
