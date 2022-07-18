package com.ezen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecondTest {

	@Test
	public void gitHubTest() {
		
		System.out.println("GitHubTest 생성입니다.");
		System.out.println("feature1 Branch로 작성한 Test입니다.");
	}
}
