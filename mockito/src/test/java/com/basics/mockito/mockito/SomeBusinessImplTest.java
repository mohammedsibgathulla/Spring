package com.basics.mockito.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void testWith3Numbers() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = someBusinessImpl.findTheGreatestFromAllTheData();
		assertEquals(40, result);
	}
	@Test
	void testWith2Numbers() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub1());
		int result = someBusinessImpl.findTheGreatestFromAllTheData();
		assertEquals(32, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub		
		return new int[] {24,32,40};
	}
	
}
//You have to create different stub versions of the class for different test cases.
class DataServiceStub1 implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub		
		return new int[] {24,32};
	}
	
}

