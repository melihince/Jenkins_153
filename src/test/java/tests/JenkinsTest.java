package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class JenkinsTest {

	@Test
	void Test1(){
		assertTrue(true);
	}
	@Test
	void Test2(){
		assertTrue(true);
	}
	@Test
	void Test3(){
		assertTrue(true);
	}
	@Test
	void Test4(){
		assertTrue(true);
	}
	@Test
	void Test5(){
		assertTrue(true);
	}
	@Test
	void Test6(){
		assertTrue(true);
	}
	@Test
	void Test7(){ assertTrue(true);}
	@Test
	void Test8(){
		assertTrue(true);
	}
	@Test
	void Test9(){
		assertTrue(true);
	}
	@Test
	void Test10(){
		assertTrue(true);
	}

}

echo "# Jenkins_153" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/melihince/Jenkins_153.git
		git push -u origin main
