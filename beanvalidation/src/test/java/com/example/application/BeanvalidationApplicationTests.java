package com.example.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.beanvalidation.BeanvalidationApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BeanvalidationApplication.class)
@WebAppConfiguration
public class BeanvalidationApplicationTests {

	@Test
	public void contextLoads() {
	}

}
