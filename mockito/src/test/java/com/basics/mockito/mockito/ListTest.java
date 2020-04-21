package com.basics.mockito.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class ListTest {

	@Mock
	List listMock;
	@Test
	void test() { 
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
		assertEquals(10, listMock.size());//Second time also will return 10
	}
	
	@Test
	public void testSizeMultipleReturns() {
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());//Second time returns 20
	}
	
	@Test
	public void testGetSpecificParameter() {
		when(listMock.get(0)).thenReturn("Some String");
		assertEquals("Some String", listMock.get(0));
		assertEquals(null, listMock.get(1));//For all the other parameters it will return null
	}
	
	@Test
	public void testGetGenericParameter() {
		when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
		assertEquals("Some String", listMock.get(0));
		assertEquals(null, listMock.get(0));//For all the other parameters it will return succeed 
		assertEquals(null, listMock.get(1));
	}
	//You cannot use combination of both generic as well as specific parameters in mockito

}
