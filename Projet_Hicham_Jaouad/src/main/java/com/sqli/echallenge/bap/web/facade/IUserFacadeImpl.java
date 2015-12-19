package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sqli.echallenge.bap.model.AdministrateurModel;
import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.model.EvaluateurModel;
import com.sqli.echallenge.bap.model.ManagerModel;
import com.sqli.echallenge.bap.model.UserModel;
import com.sqli.echallenge.bap.service.IUserService;
import com.sqli.echallenge.bap.web.converters.IAdminConverter;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IEvaluateurConverter;
import com.sqli.echallenge.bap.web.converters.IManagerConverter;
import com.sqli.echallenge.bap.web.dto.AdministrateurDto;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.EvaluateurDto;
import com.sqli.echallenge.bap.web.dto.ManagerDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.UserDto;


public class IUserFacadeImpl<T extends UserModel> implements IUserFacade {

	//services
	@Autowired
	private IUserService userService;
	@Autowired
	private IObjectifFacade f;
	
	//converters
	//private IConverter<T> converter;
	private ICollaborateurConverter colConverter;
	private IAdminConverter adminConverter;
	private IManagerConverter managerConverter;
	private IEvaluateurConverter evConverter;

	
	public void setF(IObjectifFacade f) {
		this.f = f;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public void setColConverter(ICollaborateurConverter colConverter) {
		this.colConverter = colConverter;
	}

	public void setAdminConverter(IAdminConverter adminConverter) {
		this.adminConverter = adminConverter;
	}

	public void setManagerConverter(IManagerConverter managerConverter) {
		this.managerConverter = managerConverter;
	}

	public void setEvConverter(IEvaluateurConverter evConverter) {
		this.evConverter = evConverter;
	}

	@Override
	public UserDto find(String modelId) {
		T userModel = (T) userService.find(modelId);
		
		if(userModel != null){
			if(userModel instanceof CollaborateurModel)
				return colConverter.convertModelDto((CollaborateurModel) userModel);

			if(userModel instanceof EvaluateurModel)
				return evConverter.convertModelDto((EvaluateurModel) userModel);

			if(userModel instanceof ManagerModel)
				return managerConverter.convertModelDto((ManagerModel) userModel);
			
			if(userModel instanceof AdministrateurModel)
				return adminConverter.convertModelDto((AdministrateurModel) userModel);
		}	
		return null;
	}


	@Override
	public Boolean delete(String id) {
		return userService.delete(id);
	}


	@Override
	public UserDto edit(UserDto um) {
		T  user = null;
		
		if(um instanceof CollaborateurDto)
			user =  (T) colConverter.convertDtoModel((CollaborateurDto) um);
		
		if(um instanceof ManagerDto)
			user =  (T) managerConverter.convertDtoModel((ManagerDto) um);
		
		if(um instanceof AdministrateurDto)
			user =  (T) adminConverter.convertDtoModel((AdministrateurDto) um);
		
		if(um instanceof EvaluateurDto)
			user =  (T) evConverter.convertDtoModel((EvaluateurDto) um);

		T userModel = (T) userService.edit(user);
		
		if(user != null){
			if(user instanceof CollaborateurModel)
				return colConverter.convertModelDto((CollaborateurModel) userModel);

			if(userModel instanceof EvaluateurModel)
				return evConverter.convertModelDto((EvaluateurModel) userModel);

			if(userModel instanceof ManagerModel)
				return managerConverter.convertModelDto((ManagerModel) userModel);
			
			if(userModel instanceof AdministrateurModel)
				return adminConverter.convertModelDto((AdministrateurModel) userModel);
		}	
		
		return null;
		}

	@Override
	public UserDto save(UserDto um) {
T  user = null;
		
		if(um instanceof CollaborateurDto)
			user =  (T) colConverter.convertDtoModel((CollaborateurDto) um);
		
		if(um instanceof ManagerDto)
			user =  (T) managerConverter.convertDtoModel((ManagerDto) um);
		
		if(um instanceof AdministrateurDto)
			user =  (T) adminConverter.convertDtoModel((AdministrateurDto) um);
		
		if(um instanceof EvaluateurDto)
			user =  (T) evConverter.convertDtoModel((EvaluateurDto) um);

		T userModel = (T) userService.save(user);
		
		if(user != null){
			if(user instanceof CollaborateurModel)
				return colConverter.convertModelDto((CollaborateurModel) userModel);

			if(userModel instanceof EvaluateurModel)
				return evConverter.convertModelDto((EvaluateurModel) userModel);

			if(userModel instanceof ManagerModel)
				return managerConverter.convertModelDto((ManagerModel) userModel);
			
			if(userModel instanceof AdministrateurModel)
				return adminConverter.convertModelDto((AdministrateurModel) userModel);
		}	
		
		return null;
	}

	@Override
	public List<EvaluateurDto> getAllEvaluateur() {
		
		List<EvaluateurDto> userDtoList = new ArrayList<EvaluateurDto>();
		List<EvaluateurModel> userModelList =  userService.getAllEvaluateur();
		for (EvaluateurModel evaluateurModel : userModelList) {
			userDtoList.add(evConverter.convertModelDto(evaluateurModel));		
		}
		if(userDtoList != null)
		return userDtoList;
		
		return null;
	}

	@Override
	public List<AdministrateurDto> getAllAdmin() {
		List<AdministrateurDto> userDtoList = new ArrayList<AdministrateurDto>();
		List<AdministrateurModel> userModelList =  userService.getAllAdmin();
		for (AdministrateurModel evaluateurModel : userModelList) {
			userDtoList.add(adminConverter.convertModelDto(evaluateurModel));		
		}
		if(userDtoList != null)
		return userDtoList;
		return null;
	}

	@Override
	public List<CollaborateurDto> getAllCollaborateur() {
		List<CollaborateurDto> userDtoList = new ArrayList<CollaborateurDto>();
		List<CollaborateurModel> userModelList =  userService.getAllCollaborateur();
		if(userDtoList != null){
		for (CollaborateurModel Model : userModelList) {
			userDtoList.add(colConverter.convertModelDto(Model));		
		}
		if(userDtoList != null)
		return userDtoList;
		}
		return null;
	}

	@Override
	public List<ManagerDto> getAllManager() {
		List<ManagerDto> userDtoList = new ArrayList<ManagerDto>();
		List<ManagerModel> userModelList =  userService.getAllManager();
		for (ManagerModel evaluateurModel : userModelList) {
			userDtoList.add(managerConverter.convertModelDto(evaluateurModel));		
		}
		if(userDtoList != null)
		return userDtoList;
		
		return null;
	}

	@Override
	public List<CollaborateurDto> getCollabEvaluateur(String matricule) {
		EvaluateurDto eval = (EvaluateurDto) this.find(matricule);
		return (List<CollaborateurDto>) eval.getCollaborateurs();
	}

	@Override
	public List<ObjectifDto> getObjectifsCollab(String matricule) {
		CollaborateurDto cola = (CollaborateurDto) this.find(matricule);
		List<ObjectifDto> listObjectifs = new ArrayList<ObjectifDto>();
		for(ObjectifDto obj : cola.getObjectifs()){
			ObjectifDto ob = f.find(obj.getIdObjectif());
			listObjectifs.add(ob);
		}
		return listObjectifs;
	}

	@Override
	public UserDto findUserByPsseudo(String mc, String pass) {
		T user = (T) userService.findUserByPsseudo(mc, pass);
		if( user instanceof CollaborateurModel)
			return colConverter.convertModelDto((CollaborateurModel) user);
		
		if(user instanceof EvaluateurModel)
			return evConverter.convertModelDto((EvaluateurModel) user);
		if(user instanceof ManagerModel)
			return managerConverter.convertModelDto((ManagerModel) user);
		
		return null;
	}

}
