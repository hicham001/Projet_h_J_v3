package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;



import com.sqli.echallenge.bap.model.SujetModel;
import com.sqli.echallenge.bap.web.converters.IAdminConverter;
import com.sqli.echallenge.bap.web.converters.IManagerConverter;
import com.sqli.echallenge.bap.web.converters.ISujetConverter;
import com.sqli.echallenge.bap.web.dto.SujetDto;

public class ISujetConverterImpl implements ISujetConverter{

	private IAdminConverter adminConverter;
	private IManagerConverter managerConverter;
	
	
	public void setAdminConverter(IAdminConverter adminConverter) {
		this.adminConverter = adminConverter;
	}

	public void setManagerConverter(IManagerConverter managerConverter) {
		this.managerConverter = managerConverter;
	}
	
	@Override
	public SujetDto convertModelDto(SujetModel source) {
		// TODO Auto-generated method stub
		return convertModelDto(source, true);
	}

	@Override
	public SujetModel convertDtoModel(SujetDto source) {
		// TODO Auto-generated method stub
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<SujetModel> convertListDtoModel(
			Collection<SujetDto> source) {
		// TODO Auto-generated method stub
		return convertListDtoModel(source, true);
	}

	@Override
	public Collection<SujetDto> convertListModelDto(
			Collection<SujetModel> source) {
		// TODO Auto-generated method stub
		return convertListModelDto(source, true);
	}

	@Override
	public SujetDto convertModelDto(SujetModel source, boolean includeRelation) {
		SujetDto target = new SujetDto();
		if(source != null){
			if(includeRelation){
		target.setAdministrateur(adminConverter.convertModelDto(source.getAdministrateur(), false));
		target.setManager(managerConverter.convertModelDto(source.getManager(), false));
			}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setContenu(source.getContenu());
		target.setDateS(source.getDateS());
		target.setId(source.getId());
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public SujetModel convertDtoModel(SujetDto source, boolean includeRelation) {
		SujetModel target = new SujetModel();
		if(source != null){
			if(includeRelation){
		target.setAdministrateur(adminConverter.convertDtoModel(source.getAdministrateur(), false));
		target.setManager(managerConverter.convertDtoModel(source.getManager(), false));
		}
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setContenu(source.getContenu());
		target.setDateS(source.getDateS());
		target.setId(source.getId());
		
		return target;
		}
		return null;
	}

	@Override
	public Collection<SujetModel> convertListDtoModel(Collection<SujetDto> source, boolean includeRelation) {
		Collection<SujetModel> listModel = new ArrayList<SujetModel>();
		if(source != null){
			for (SujetDto sujetDto : source) {
				listModel.add(convertDtoModel(sujetDto,includeRelation));
			}
			return listModel;
		}
		return null;
	}

	@Override
	public Collection<SujetDto> convertListModelDto(Collection<SujetModel> source, boolean includeRelation) {
		
		Collection<SujetDto> listDto = new ArrayList<SujetDto>();
		if(source != null){
			for (SujetModel sujetModel : source) {
				listDto.add(convertModelDto(sujetModel,includeRelation));
			}
			return listDto;
		}
		return null;
	}


}
