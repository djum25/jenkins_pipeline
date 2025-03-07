package com.djum.project_jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ProjectJenkinsApplicationTests {

	@Test
	void contextLoads() {
		Assert.isTrue(true, "test reussi");
	}

}
