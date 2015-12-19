package com.sqli.echallenge.bap.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.facade.IUserFacade;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TestCollaborateur {
	@Autowired
	public IUserFacade userFacade;
	
	@Test
	@Transactional
	@Rollback(true)
	public void testAddNewObejctif() {
		CollaborateurDto col = new CollaborateurDto();
		col.setMatricule("Mat1");
		
		userFacade.save(col);
		Assert.assertNotNull(col.getMatricule());
		Assert.assertEquals(1, userFacade.getAllCollaborateur().size());
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testDeleteObejctif() {

		CollaborateurDto col1 = new CollaborateurDto();
		CollaborateurDto col2 = new CollaborateurDto();
		col1.setMatricule("Mat1");
		col2.setMatricule("Mat2");
		userFacade.save(col1);
		userFacade.save(col2);
		Assert.assertEquals(2, userFacade.getAllCollaborateur().size());
		userFacade.delete(col1.getMatricule());
		Assert.assertEquals(1, userFacade.getAllCollaborateur().size());
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testEditObjectif() {
		CollaborateurDto col1 = new CollaborateurDto();
		col1.setMatricule("Mat3");
		col1.setEmail("hicham@gmail.com");
		userFacade.save(col1);
		
		Assert.assertEquals("hicham@gmail.com", col1.getEmail());
		col1.setEmail("hicham.naam@sqli.com");
		userFacade.edit(col1);
		Assert.assertEquals("hicham.naam@sqli.com", col1.getEmail());
	}
}
