package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JpaApplication.class})
public class JpaApplicationTests {


	@Test
	public void contextLoads() {
		MyNonSpring.getInstance().doSomeThing("valdis");
	}

}
