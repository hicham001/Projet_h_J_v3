package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.EvaluateurDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ProjetDto;

public interface IProjetFacade {
	public ProjetDto find(String modelId);
	public Boolean delete(String id);
	public ProjetDto edit(ProjetDto um);
	public ProjetDto save(ProjetDto um);
	public List<ProjetDto> findAll();
	public ProjetDto saveProjetEvaluateurs(ProjetDto pr, List<EvaluateurDto> list);
	public ProjetDto getProjetObjectif(ObjectifDto obj);
	public List<ProjetDto> getProjetByObjectifs(List<ObjectifDto> objectifs);

	public List<ProjetDto>  getProjetByCollaborateur(String matricule);
}
