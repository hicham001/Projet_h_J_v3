package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.AdministrateurDto;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.EvaluateurDto;
import com.sqli.echallenge.bap.web.dto.ManagerDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.UserDto;

public interface IUserFacade{
	public UserDto find(String modelId);
	public Boolean delete(String id);
	public UserDto edit(UserDto um);
	public UserDto save(UserDto um);
	public List<EvaluateurDto> getAllEvaluateur();
	public List<AdministrateurDto> getAllAdmin();
	public List<CollaborateurDto> getAllCollaborateur();
	public List<ManagerDto> getAllManager();
	public UserDto findUserByPsseudo(String mc, String pass);
	public List<CollaborateurDto> getCollabEvaluateur(String matricule);
	public List<ObjectifDto> getObjectifsCollab(String matricule);
	public List<CollaborateurDto> getCollaborateurManager(String matricule);
}
