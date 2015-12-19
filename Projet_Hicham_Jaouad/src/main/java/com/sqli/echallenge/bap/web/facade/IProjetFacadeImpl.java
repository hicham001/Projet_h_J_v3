package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sqli.echallenge.bap.model.ProjetModel;
import com.sqli.echallenge.bap.service.IProjetService;
import com.sqli.echallenge.bap.web.converters.IProjetConverter;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.EvaluateurDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ProjetDto;

public class IProjetFacadeImpl implements IProjetFacade{

	private IProjetService projetService;
	@Autowired
	private IObjectifFacade f;
	@Autowired
	private IUserFacade facade;
	private IProjetConverter converter;
	
	
	
	public void setF(IObjectifFacade f) {
		this.f = f;
	}

	public void setProjetService(IProjetService projetService) {
		this.projetService = projetService;
	}

	public void setConverter(IProjetConverter converter) {
		this.converter = converter;
	}

	@Override
	public ProjetDto find(String modelId) {
		return converter.convertModelDto(projetService.find(modelId));
	}

	@Override
	public Boolean delete(String id) {
		return projetService.delete(id);
	}

	@Override
	public ProjetDto edit(ProjetDto pr) {
		ProjetModel projetModel = converter.convertDtoModel(pr);
		if(projetModel != null)
		return converter.convertModelDto(projetService.edit(projetModel));
		return null;
	}

	@Override
	public ProjetDto save(ProjetDto pr) {
		ProjetModel projetModel = converter.convertDtoModel(pr);
		if(projetModel != null)
		return converter.convertModelDto(projetService.save(projetModel));
		return null;
	}

	@Override
	public List<ProjetDto> findAll() {
		List<ProjetDto> projetDtoList = new ArrayList<ProjetDto>();
		List<ProjetModel> projetModel = projetService.findAll();
		if(projetModel != null){
			for (ProjetModel model : projetModel) {
				projetDtoList.add(converter.convertModelDto(model));
			}
			return projetDtoList;
		}
			return null;
	}

	@Override
	public ProjetDto saveProjetEvaluateurs(ProjetDto pr,
			List<EvaluateurDto> list) {
		if(list != null){
			pr.setEvaluateurs(list);
			return save(pr);
		}
		return null;
	}

	@Override
	public ProjetDto getProjetObjectif(ObjectifDto obj) {
		ObjectifDto ob = f.find(obj.getIdObjectif());
		return ob.getProjet();
	}

	@Override
	public List<ProjetDto> getProjetByObjectifs(List<ObjectifDto> objectifs) {
		List<ProjetDto> listprojet = new ArrayList<ProjetDto>();
		for(ObjectifDto ob : objectifs){
			ObjectifDto obj = f.find(ob.getIdObjectif());
			if(obj!=null)
			listprojet.add(obj.getProjet());
		}
		return listprojet;
	}

	@Override
	public List<ProjetDto> getProjetByCollaborateur(String matricule) {
		CollaborateurDto colab = (CollaborateurDto) facade.find(matricule);
		List<ProjetDto> listprojet = new ArrayList<ProjetDto>();
		for(ObjectifDto ob : colab.getObjectifs()){
			ObjectifDto obj = f.find(ob.getIdObjectif());
			if(obj!=null)
			listprojet.add(obj.getProjet());
		}
		return listprojet;
	}
	
	

}
