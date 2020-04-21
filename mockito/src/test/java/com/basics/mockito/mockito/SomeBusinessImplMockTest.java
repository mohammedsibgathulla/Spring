package com.basics.mockito.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {
	DataService dataServiceMock = mock(DataService.class);
	SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
	@Test
	void testWith3Numbers() { 
		when(dataServiceMock.retrieveAllData()).thenReturn( new int[] {20,32,40});		
		assertEquals(40, someBusinessImpl.findTheGreatestFromAllTheData());
	}
	
	@Test
	void testWith2Numbers() {
		when(dataServiceMock.retrieveAllData()).thenReturn( new int[] {20,32}); 
		assertEquals(32, someBusinessImpl.findTheGreatestFromAllTheData());
	}

}
