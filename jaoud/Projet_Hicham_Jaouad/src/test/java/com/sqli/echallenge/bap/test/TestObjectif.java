package com.sqli.echallenge.bap.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.facade.IObjectifFacade;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")

public class TestObjectif {
	private StringBuffer verificationErrors=new StringBuffer();
	@Autowired
	public IObjectifFacade objectifFacade;
	
	@Test
	@Transactional
	public void testAddNewObejctif() {
		System.out.println("test 	add");
		ObjectifDto objectif = new ObjectifDto("ObectifIntitule1");
		objectifFacade.save(objectif);
		
		Assert.assertNotNull(objectif.getIntitule());
		Assert.assertEquals(1, objectifFacade.findAll().size());
	}
	@Test
	@Transactional
	public void testDeleteObejctif() {
		System.out.println("test 	delete");
		try{
		ObjectifDto objectif1 = new ObjectifDto("ObectifIntitule4");
		ObjectifDto objectif2 = new ObjectifDto("ObectifIntitule5");
		ObjectifDto objectif3 = new ObjectifDto("ObectifIntitule3");

		objectifFacade.save(objectif1);
		objectifFacade.save(objectif2);
		Assert.assertEquals(2, objectifFacade.findAll().size());
		System.out.println("iddd " +objectif2.getIdObjectif());
		
		//objectif3 = objectifFacade.find(objectif2.getIdObjectif());
		//objectif3 = objectifFacade.find(objectif1.getIdObjectif());
		
		//Assert.assertNotNull(objectif1.getIntitule());
		objectifFacade.delete(objectif3.getIdObjectif());
		Assert.assertEquals(1, objectifFacade.findAll().size());
	}catch(Exception e){
		this.verificationErrors.append(e.getMessage());
	}
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testEditObjectif() {
		System.out.println("test 	edit");
		ObjectifDto objectif1 = new ObjectifDto("ObectifIntitule1");

		objectifFacade.save(objectif1);
		
		Assert.assertEquals("ObectifIntitule1", objectif1.getIntitule());
		objectif1.setIntitule("ObectifIntitule2");
		objectifFacade.edit(objectif1);
		Assert.assertEquals("ObectifIntitule2", objectif1.getIntitule());
	}
	@After
	public void aftertest(){
		if(this.verificationErrors.toString().isEmpty()){
			fail(this.verificationErrors.toString());
		}
	}
}
