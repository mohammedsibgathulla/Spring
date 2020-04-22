package com.spring.basics.springbasicsteps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@ContextConfiguration(locations="/applicationContext.xml")
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXMLConfigurationTest {
	@Autowired
	BinarySearchImpl binarySearch;
	@Test
	public void test() {
		int result = binarySearch.binarySearchR1();
		assertEquals(3, result);
	}

}
