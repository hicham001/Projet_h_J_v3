package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sqli.echallenge.bap.model.ReponseObjModel;
import com.sqli.echallenge.bap.service.IReponseObjService;
import com.sqli.echallenge.bap.web.converters.IReponseObjConverter;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ReponseObjDto;

public class IReponseObjFacadeImpl implements IReponseObjFacade{

	
	private IReponseObjService reponseObjService;
	private IReponseObjConverter converter;
	@Autowired
	private IUserFacade facade;
	@Autowired
	private IObjectifFacade fobj;
	
	public void setFacade(IUserFacade facade) {
		this.facade = facade;
	}

	public void setFobj(IObjectifFacade fobj) {
		this.fobj = fobj;
	}

	public void setReponseObjService(IReponseObjService reponseObjService) {
		this.reponseObjService = reponseObjService;
	}
	public void setConverter(IReponseObjConverter converter) {
		this.converter = converter;
	}

	@Override
	public ReponseObjDto find(Long modelId) {
		return converter.convertModelDto(reponseObjService.find(modelId));
	}

	@Override
	public Boolean delete(Long id) {
		return reponseObjService.delete(id);
	}

	@Override
	public ReponseObjDto edit(ReponseObjDto model) {
		ReponseObjModel Model = converter.convertDtoModel(model);
		if(Model !=null)
			return converter.convertModelDto(reponseObjService.edit(Model));
		return null;
	}

	@Override
	public ReponseObjDto save(ReponseObjDto model) {
		ReponseObjModel Model = converter.convertDtoModel(model);
		if(Model !=null)
			return converter.convertModelDto(reponseObjService.save(Model));
		return null;
	}

	@Override
	public List<ReponseObjDto> findAll() {
		List<ReponseObjDto> dtoList = new ArrayList<ReponseObjDto>();
		List<ReponseObjModel> list = reponseObjService.findAll();
		if(list != null){
			for (ReponseObjModel obj : list) {
				dtoList.add(converter.convertModelDto(obj));
			}
			return dtoList;
		}
			return null;
	}

	@Override
	public ReponseObjDto getReponse(CollaborateurDto collab, ObjectifDto obj) {
		
		CollaborateurDto col = (CollaborateurDto) facade.find(collab.getMatricule());
		ObjectifDto ob = fobj.find(obj.getIdObjectif());
		for(ReponseObjDto r : this.findAll()){
			if(r.getCollaborateur().equals(col) && r.getObjectif().equals(ob))
				return r;
		}
		return null;
	}

	@Override
	public ReponseObjDto Modifier(ReponseObjDto reponse) {
		ReponseObjDto r = this.find(reponse.getIdReponse());
		r.setValeur(reponse.getValeur());
		if(r.getNbrRejet()<3){
		if(r.getValeur().equals("Rejeter")){
			r.setNbrRejet(r.getNbrRejet()+1);
			}
		}
		else
			r.setValeur("Valider");
		
		return this.edit(r);
	}

	@Override
	public List<ReponseObjDto> editListReponse(List<ReponseObjDto> list) {
		List<ReponseObjDto> l = new ArrayList<ReponseObjDto>();
		for(ReponseObjDto rep : list){
			ReponseObjDto r1 = this.find(rep.getIdReponse());
			r1.setValeur(rep.getValeur());
			ReponseObjDto r = this.Modifier(r1);
			l.add(r);
		}
		return l;
	}

	@Override
	public List<ReponseObjDto> savetListReponse(List<ReponseObjDto> list) {
		List<ReponseObjDto> l = new ArrayList<ReponseObjDto>();
		for(ReponseObjDto rep : list){
			ReponseObjDto r = this.addReponse(rep);
			l.add(r);
		}
		return l;
	}

	@Override
	public ReponseObjDto addReponse(ReponseObjDto r) {
		if(r.getValeur().equals("Rejeter")){
			r.setNbrRejet(r.getNbrRejet()+1);
			}
		else
			r.setNbrRejet(0L);
		return this.save(r);
	}

	@Override
	public List<ReponseObjDto> getReponseObjCollab(ObjectifDto ob, CollaborateurDto c) {
		CollaborateurDto colab = (CollaborateurDto) facade.find(c.getMatricule());
		ObjectifDto obj = fobj.find(ob.getIdObjectif());
		List<ReponseObjDto> list = new ArrayList<ReponseObjDto>();
		for(ReponseObjDto reponse : this.findAll()){
			if(reponse.getCollaborateur().equals(colab) && reponse.getObjectif().equals(obj))
				list.add(reponse);
		}
		return list;
	}

	@Override
	public List<ReponseObjDto> getReponseCollaborateur(String matricule) {
		CollaborateurDto c = (CollaborateurDto) facade.find(matricule);
		List<ReponseObjDto> list = new ArrayList<ReponseObjDto>();
		for(ReponseObjDto r : this.findAll()){
			ReponseObjDto r1 = this.find(r.getIdReponse());
			if(r1.getCollaborateur().getMatricule().equals(c.getMatricule()))
				list.add(r);		
		}
		
		return list;
	}


}
