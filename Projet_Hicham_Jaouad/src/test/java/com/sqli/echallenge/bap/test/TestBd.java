package com.sqli.echallenge.bap.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

import javassist.ClassPath;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;

import com.sqli.echallenge.bap.dao.IUserDao;
import com.sqli.echallenge.bap.model.AdministrateurModel;
import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.model.StatusBAP;
import com.sqli.echallenge.bap.model.UserModel;
import com.sqli.echallenge.bap.service.IUserService;
import com.sqli.echallenge.bap.web.dto.AbstractDto;
import com.sqli.echallenge.bap.web.dto.AdministrateurDto;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;
import com.sqli.echallenge.bap.web.dto.EvaluateurDto;
import com.sqli.echallenge.bap.web.dto.FeedbackDto;
import com.sqli.echallenge.bap.web.dto.ManagerDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.PosteDto;
import com.sqli.echallenge.bap.web.dto.ProjetDto;
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;
import com.sqli.echallenge.bap.web.dto.SujetDto;
import com.sqli.echallenge.bap.web.dto.UserDto;
import com.sqli.echallenge.bap.web.facade.IBapFacade;
import com.sqli.echallenge.bap.web.facade.IDescriptionObjFacade;
import com.sqli.echallenge.bap.web.facade.IFeedbackFacade;
import com.sqli.echallenge.bap.web.facade.IObjectifFacade;
import com.sqli.echallenge.bap.web.facade.IPosteFacade;
import com.sqli.echallenge.bap.web.facade.IProjetFacade;
import com.sqli.echallenge.bap.web.facade.IResultatPoidsFacade;
import com.sqli.echallenge.bap.web.facade.ISujetFacade;
import com.sqli.echallenge.bap.web.facade.IUserFacade;

public class TestBd {
	@Test
	public void test() {

			ClassPathXmlApplicationContext app = 
		
				new ClassPathXmlApplicationContext(new String[] {
						"application-context.xml"});
			IUserFacade facade = (IUserFacade) app.getBean("userFacade");
			ISujetFacade fsujet = (ISujetFacade) app.getBean("SujetFacade");
			IBapFacade fbap = (IBapFacade) app.getBean("BapFacade");
			IObjectifFacade fobj = (IObjectifFacade) app.getBean("ObjectifFacade");
			IDescriptionObjFacade fdes = (IDescriptionObjFacade) app.getBean("DescriptionObjFacade");
			IProjetFacade fprojet = (IProjetFacade) app.getBean("ProjetFacade");
			IResultatPoidsFacade fres = (IResultatPoidsFacade) app.getBean("ResultatPoidsFacade");
			/*EvaluateurDto eval = new EvaluateurDto();
			eval.setMatricule("eval1");
			CollaborateurDto col = new CollaborateurDto();
			col.setMatricule("colab1");
			facade.save(col);
			facade.save(eval);*/

		/*	CollaborateurDto c = (CollaborateurDto) facade.find("colab1");
=======
			/*CollaborateurDto c = (CollaborateurDto) facade.find("matcollab");
			//CollaborateurDto Collab = (CollaborateurDto) facade.find("matriculecollab");
			EvaluateurDto eva1 = (EvaluateurDto) facade.find("mateval1");
			EvaluateurDto eva2 = (EvaluateurDto) facade.find("mateval2");
			List<EvaluateurDto> list = new ArrayList<EvaluateurDto>();
			list.add(eva1);
			list.add(eva2);
			c.setEvaluateurs(list);
			facade.edit(c);*/
			//DescriptionObjDto d = new DescriptionObjDto();
			//d.setDescription("des1");
			//fdes.save(d);
			/*DescriptionObjDto d1 = fdes.find(2L);
			DescriptionObjDto d2 = fdes.find(1L);
			ResultatPoidsDto resultat = new ResultatPoidsDto();
			ResultatPoidsDto resultat1 = new ResultatPoidsDto();
			resultat.setCollaborateur(c);
			resultat1.setCollaborateur(c);
			resultat1.setDescriptionObj(d2);
			resultat.setDescriptionObj(d1);
			List<ResultatPoidsDto> l = new ArrayList<ResultatPoidsDto>();
			l.add(resultat1);
			l.add(resultat);*/
		    //d1.setResultatpoids(resultatpoids);
		
			/*ResultatPoidsDto r = new ResultatPoidsDto();
			
			r.setPoids((double) 33);
			CollaborateurDto c1 = (CollaborateurDto) facade.find("hhh");
			DescriptionObjDto r1 = fdes.find((long) 3);
			r.setDescriptionObj(r1);
			fres.save(r);*/
			
			/*ResultatPoidsDto rr = fres.find((long) 3);
			List<ResultatPoidsDto> li = new ArrayList<ResultatPoidsDto>();
			li.add(rr);
			c1.setResultatPoids(li);
			facade.edit(c1);
			*/
			
		
	}
	

}
