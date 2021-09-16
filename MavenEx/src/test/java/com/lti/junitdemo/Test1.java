/*package com.lti.junitdemo;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class Test1 {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	void testShow()
	{
		MyApp m=new MyApp();
		String s= m.show();
		Assertions.assertEquals("hello maven",s);
	}
	
	@Test
	void testAdd() {
		//fail("Not yet implemented");
		int r=Calculator.add(100,200);
		Assertions.assertEquals(300,r);
		Assertions.assertEquals(100,Calculator.add(50,50),"Testing");
		Assertions.assertNotEquals(400,r);
	}
	
	@Test
	void testAssertFalse()
	{
		Assertions.assertFalse("monica".length()==10);
		Assertions.assertFalse(10>20,"comparing two values");
	}

	@Test
	void TestAssertNull()
	{
		String s1=null;
		String s2="abc";
		String s3="xyz";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
		
	}
	@Test
	void TestAssertAll()
	{
		String str1="abc";
		String str2="pqr";
		String str3="xyz";
		Assertions.assertAll("data",
				() -> Assertions.assertEquals(str1,"abc"),
				() -> Assertions.assertEquals(str2,"pqr"),
				() -> Assertions.assertEquals(str3,"xyz")
				);
	}
	
	@Test
	void testCollections()
	{
		ArrayList<String> my=new ArrayList<>();
		my.add("Hello");
		Assertions.assertFalse(my.isEmpty());
		ArrayList<Integer> my1=new ArrayList<>();
		Assertions.assertEquals(true,my1.isEmpty());
	}
	
	@BeforeAll
	static void setup() {
		System.out.println("only once in beg - @BeforeAll executed\n");
	}

	@BeforeEach
	void setupThis() {
		System.out.println("@BeforeEach executed");
	}

	@Test
	void testCalcOne() {
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(4, Calculator.add(2, 2));
	}

	// @Disabled
	@Test
	void testCalcTwo() {
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(6, Calculator.add(2, 4));
	}

	@AfterEach
	void tearThis() {
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear() {
		System.out.println("\n once aat the end - clean up @AfterAll executed");
	}
	
}*/
