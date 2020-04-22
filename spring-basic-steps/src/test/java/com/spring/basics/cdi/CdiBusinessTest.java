package com.spring.basics.cdi;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
 

@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes=SpringBasicCdiApplication.class)
public class CdiBusinessTest {

	@Inject
	CdiBusiness cdiBusiness;
	
	@Mock
	CdiPersonDAO cdiPersonDAO;
	
	@Test
	public void test() {
		Mockito.when(cdiPersonDAO.getData()).thenReturn(3);
		assertEquals(3, cdiBusiness.getData());
	}
	
	@Test
	public void testEmpty() {
		Mockito.when(cdiPersonDAO.getData()).thenReturn(null);
		assertEquals(3, cdiBusiness.getData());
	}

}
