package com.basics.mockito.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
class SomeBusinessImplMockTest {
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
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
