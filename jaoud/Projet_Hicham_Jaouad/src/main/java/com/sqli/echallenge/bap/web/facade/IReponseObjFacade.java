package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ReponseObjDto;

public interface IReponseObjFacade {
	

	public ReponseObjDto find(Long modelId);
	public Boolean delete(Long id);
	public ReponseObjDto edit(ReponseObjDto model);
	public ReponseObjDto save(ReponseObjDto model);
	public List<ReponseObjDto> findAll();
	public ReponseObjDto getReponse(CollaborateurDto collab,ObjectifDto obj);
	public ReponseObjDto Modifier(ReponseObjDto reponse);
	public List<ReponseObjDto> editListReponse(List<ReponseObjDto> list);
	public List<ReponseObjDto> savetListReponse(List<ReponseObjDto> list);
	public ReponseObjDto addReponse(ReponseObjDto r);
	public List<ReponseObjDto> getReponseObjCollab(ObjectifDto ob,CollaborateurDto c);
	public List<ReponseObjDto> getReponseCollaborateur(String matricule);
}
